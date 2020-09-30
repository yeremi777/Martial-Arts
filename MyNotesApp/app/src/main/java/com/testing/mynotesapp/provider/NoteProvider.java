package com.testing.mynotesapp.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;

import androidx.annotation.NonNull;

import com.testing.mynotesapp.db.NoteHelper;

import static com.testing.mynotesapp.db.DatabaseContract.AUTHORITY;
import static com.testing.mynotesapp.db.DatabaseContract.NoteColumns.CONTENT_URI;
import static com.testing.mynotesapp.db.DatabaseContract.NoteColumns.TABLE_NAME;

public class NoteProvider extends ContentProvider {
    private static final int NOTE = 1;
    private static final int NOTE_ID = 2;
    private NoteHelper noteHelper;

    private static final UriMatcher sUriMatcher = new UriMatcher(UriMatcher.NO_MATCH);

    static {
        sUriMatcher.addURI(AUTHORITY, TABLE_NAME, NOTE);

        sUriMatcher.addURI(AUTHORITY,
                TABLE_NAME + "/#",
                NOTE_ID);
    }

    public NoteProvider() {
    }

    @Override
    public boolean onCreate() {
        noteHelper = NoteHelper.getInstance(getContext());
        noteHelper.open();
        return true;
    }

    @Override
    public Cursor query(@NonNull Uri uri, String[] strings, String s, String[] strings1, String s1) {
        Cursor cursor;
        switch(sUriMatcher.match(uri)) {
            case NOTE:
                cursor = noteHelper.queryAll();
                break;
            case NOTE_ID:
                cursor = noteHelper.queryById(uri.getLastPathSegment());
                break;
            default:
                cursor = null;
                break;
        }
        return cursor;
    }

    @Override
    public String getType(Uri uri) {
        return null;
    }

    @Override
    public Uri insert(@NonNull Uri uri, ContentValues contentValues) {
        long added;
        switch(sUriMatcher.match(uri)) {
            case NOTE:
                added = noteHelper.insert(contentValues);
                break;
            default:
                added = 0;
                break;
        }
        getContext().getContentResolver().notifyChange(CONTENT_URI, null);
        return Uri.parse(CONTENT_URI + "/" + added);
    }

    @Override
    public int update(@NonNull Uri uri, ContentValues contentValues, String s, String[] strings) {
        int updated;
        switch(sUriMatcher.match(uri)) {
            case NOTE_ID:
                updated = noteHelper.update(uri.getLastPathSegment(), contentValues);
                break;
            default:
                updated = 0;
                break;
        }
        getContext().getContentResolver().notifyChange(CONTENT_URI, null);
        return updated;
    }

    @Override
    public int delete(@NonNull Uri uri, String s, String[] strings) {
        int deleted;
        switch(sUriMatcher.match(uri)) {
            case NOTE_ID:
                deleted = noteHelper.deleteById(uri.getLastPathSegment());
                break;
            default:
                deleted = 0;
                break;
        }
        getContext().getContentResolver().notifyChange(CONTENT_URI, null);
        return deleted;
    }
}
