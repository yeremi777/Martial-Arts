package com.testing.martialarts;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MartialArtsData {
    private static String[] martialArtsName = {
            "Jeet Kune Do",
            "Jiu Jitsu",
            "Karate",
            "Kungfu",
            "Muay Thai",
            "Pencak Silat",
            "Taekwondo",
            "Tinju",
            "Wing Chun",
            "Wushu"
    };

    private static String[] martialArtsDetail = {
            "Jeet Kune Do (截拳道) disingkat JKD, dalam bahasa Mandarin 'Jié quán dào, dalam Bahasa kanton: Jit kyùn dou adalah sebuah seni bela diri yang diciptakan oleh Bruce Lee. Dia tidak hanya mempelajari Wing Chun, tetapi juga tinju, karate, arnis, jujitsu, judo. Dari berbagai macam beladiri tersebut kemudian dipadukan dan disederhanakan sehingga terbentuklah sebuah seni bela diri yang praktis dan mudah di kuasai seseorang. JKD merupakan seni bela diri yang mengutamakan karakter dan kemampuan diri sendiri, jadi setiap praktisi JKD diharapkan untuk menjadi dirinya sendiri.\n" +
                    "\n" +
                    "Bruce Lee menginginkan untuk menciptakan seni beladiri yang tak terbatas dan bebas. Kemudian dalam perkembanganya, Jeet Kune Do di ciptakan bukan hanya untuk menjadi petarung yang lebih baik, namun juga sebagai seni untuk pengembangan diri.\n" +
                    "\n" +
                    "Jeet Kune Do tidak hanya mendukung kombinasi dari berbagai aspek gaya yang berbeda, tetapi juga telah mengubah banyak aspek yang diadopsi dan di sesuaikan dengan kemampuan seorang praktisi, dan JKD mendukung para praktisi untuk menterjemahkan berbagai teknik untuk dirinya sendiri, dan mengubahnya untuk tujuan mereka sendiri. Sebagai contoh, lee hampir selalu meletakan tangan yang kuat di depan dan yang lebih lemah di belakang, dengan sikap kuda kuda seperti ini, ia menggunakan teknik dari tinju, anggar, dan Wing Chun. Seperti halnya anggar posisi sperti ini disebut sebagai “posisi siap siaga”. Lee menggabungkan posisi ini dalam JKDnya, seperti yang dia rasakan ini menjadikan mobilitas yang terbaik. Lee merasakan bahwa tangan yang dominan atau terkuat haruslah di depan karena akan bekerja lebih banyak. Lee meminimalkan penggunaan sikap yang lain kecuali ketika keadaan menjamin aksinya. Walaupun posisi “siap siaga” itu adalah posisi yang baik, ini bukan berarti hanya terpaku pada satu bentuk itu saja. Lee mengakui bahwa pada saat yang lain posisi yang lain harus digunakan.",
            "Jiu-jitsu Brasil (bahasa Inggris: Brazillian jiu-jitsu (BJJ)) adalah sebuah bela diri yang terfokus pada pertarungan lantai yang pertama kali dipopulerkan di Brasil. Bela diri ini merupakan sebuah pengembangan dari bela diri Kodokan Judo, yang dipelopori oleh Mitsuyo Maeda bersama Keluarga Gracie. Lebih jauh lagi, keluarga Gracie telah berhasil mempopulerkan bela diri dalam taraf internasional. Salah satu acara yang dinilai paling berhasil mempopulerkan bela diri ini adalah ajang tarung Ultimate Fighting Championship (UFC) yang beberapa kali dimenangkan oleh Royce Gracie.\n" +
                    "\n" +
                    "Teknik yang dipelajari pada BJJ lebih terfokus pada pertarungan lantai, bantingan, kuncian, dan cekikan. Filosofi yang dipegang oleh praktisi bela diri ini adalah bagaimana lawan yang lebih kecil, lebih lemah, dan lebih lambat dapat menghadapi lawan yang besar dan kuat.\n" +
                    "\n" +
                    "Sebagai olahraga, Jiu Jitsu Brazil mempunyai turnamen yang digelar dalam berbagai tingkatan. Sebagai seni bertarung, Jiu Jitsu Brazil banyak dipelajari sebagai upaya untuk membela diri dari tindak kriminal. Di samping itu, bela diri ini banyak diadopsi oleh praktisi bela diri campuran (Mixed Martial Arts) maupun kalangan militer.",
            "Karate (Jepang: 空 手 ) adalah seni bela diri yang berasal dari Jepang. Seni bela diri ini sedikit dipengaruhi oleh Seni bela diri Cina kenpō. Karate dibawa masuk ke Jepang lewat Okinawa dan mulai berkembang di Ryukyu Islands. Seni bela diri ini pertama kali disebut \"Tote” yang berarti seperti “Tinju China”. Ketika karate masuk ke Jepang, nasionalisme Jepang pada saat itu sedang tinggi-tingginya, sehingga Sensei Gichin Funakoshi mengubah kanji Okinawa (Tote: Tinju China) dalam kanji Jepang menjadi ‘karate’ (Tangan Kosong) agar lebih mudah diterima oleh masyarakat Jepang. Karate terdiri dari atas dua kanji. Yang pertama adalah ‘Kara’ 空 dan berarti ‘kosong’. Dan yang kedua, ‘te’ 手, berarti ‘tangan'. Yang dua kanji bersama artinya “tangan kosong” 空手 (pinyin: kongshou).\n" +
                    "\n" +
                    "Menurut Zen-Nippon Karatedo Renmei / Japan Karatedo Federation (JKF) dan World Karate Federation (WKF), yang dianggap sebagai gaya karate yang utama yaitu:\n" +
                    " 1. Shotokan\n" +
                    " 2. Goju-Ryu\n" +
                    " 3. Shito-Ryu\n" +
                    " 4. Wado-Ryu\n" +
                    "Keempat aliran tersebut diakui sebagai gaya Karate yang utama karena turut serta dalam pembentukan JKF dan WKF.\n" +
                    "\n" +
                    "Namun gaya karate yang terkemuka di dunia bukan hanya empat gaya di atas itu saja. Beberapa aliran besar seperti Kyokushin , Shorin-ryu dan Uechi-ryu tersebar luas ke berbagai negara di dunia dan dikenal sebagai aliran Karate yang termasyhur, walaupun tidak termasuk dalam \"4 besar WKF\".",
            "Kungfu atau gongfu (功夫, Pinyin: gōngfu) adalah ilmu bela diri yang berasal dari Tiongkok kuno. Akan tetapi, arti kata Kungfu sebenarnya memiliki makna yang jauh lebih luas, yakni sesuatu yang diperoleh dalam jangka waktu yang lama dan dengan ketekunan yang tinggi. Dengan demikian, seorang ahli pelaku yang mempunyai keahlian khusus atau hebat pun dapat dikatakan memiliki Kungfu yang tinggi.\n" +
                    "\n" +
                    "Selain kata Kungfu, istilah Wushu dan Kundao atau Kuntao juga sering dipakai untuk menyebut ilmu bela diri dari Tiongkok tersebut. Ilmu Kungfu yang sudah menyebar ke Asia Tenggara (terutama Indonesia) pada masa lalu disebut Kuntao (Kuntaw), demikian menurut Donn F. Draeger dalam bukunya yang berjudul Weapons and Fighting Arts of Indonesia. Akan tetapi istilah Kuntao tersebut sudah sangat jarang dipergunakan pada masa sekarang ini.\n" +
                    "\n" +
                    "Ilmu bela diri Kungfu pada mulanya berkembang dari kebutuhan dan kemampuan manusia untuk bertahan hidup, baik untuk membela diri dari berbagai jenis serangan binatang buas, berburu untuk mendapatkan makanan, maupun untuk berperang melawan kelompok manusia lain yang dianggap menjadi ancaman terhadap keamanan hidup mereka. Dengan semakin berkembangnya ilmu pengetahuan tentang obat-obatan dan tubuh manusia di Tiongkok kuno - serta perang saudara yang berkepanjangan, Seni Bela Diri Kungfu pun berkembang pesat dan menyebar luas, sehingga membawa banyak kontribusi dan memengaruhi cikal bakal berbagai jenis ilmu bela diri di Asia, seperti Shorinji Kempo(Shaolin Kempo), Karate, Jujitsu, Taekwondo, Judo, Hapkido, Pencak Silat dan lain sebagainya.",
            "Muay Thai atau Tinju Thai (bahasa Thai: มวยไทย, IPA: [muɛ̄j tʰɑ̄j]) adalah seni bela diri keras dari Kerajaan Thai. Muay Thai mirip dengan gaya seni bela diri lain dari Indocina, seperti pradal serey dari daerah Kamboja, Tomoi dari daerah Malaysia, lethwei dari daerah Myanmar dan Muay Lao dari daerah Laos. Muay Thai adalah olahraga nasional Kerajaan Thai dan turunan dari bela diri kuno Muay Boran. Sekilas Muay Thai dan Kickboxing memiliki teknik pertarungan yang hampir sama.\n" +
                    "\n" +
                    "Kata Muay berasal dari bahasa Sanskerta \"mavya\" (\"tinju bela diri\") dan Thai berasal dari kata \"Tai\" (\"suku Thai\"). Muay Thai disebut sebagai \"Seni Delapan Tungkai\" atau \"Ilmu Delapan Tungkai\" karena tehniknya sangat sarat menggunakan pukulan, tendangan, siku dan serangan lutut, sehingga penggunaan delapan \"titik kontak\", yang berbeda dengan tehnik \"dua poin\" (tinju) di tinju gaya Barat dan \"empat poin\" (tangan dan kaki) yang digunakan dalam seni bela diri yang berorientasi olahraga. Seorang praktisi Muay Thai dikenal sebagai nak Muay , sedangkan praktisi Barat, kulit putih atau non-Asia Tenggara kadang-kadang disebut nak Muay farang, yang berarti \"petinju asing\".",
            "Pencak silat atau silat adalah suatu seni bela diri tradisional yang berasal dari Kepulauan Nusantara(Indonesia). Seni bela diri ini secara luas dikenal di Indonesia, Malaysia, Brunei, dan Singapura, Filipina selatan, dan Thailand selatan sesuai dengan penyebaran berbagai suku bangsa Nusantara.\n" +
                    "\n" +
                    "Pencak silat adalah olahraga bela diri yang memerlukan banyak konsentrasi. Ada pengaruh budaya Cina, agama Hindu, Budha, dan Islam dalam pencak silat. Biasanya setiap daerah di Indonesia mempunyai aliran pencak silat yang khas. Misalnya, daerah Jawa Barat terkenal dengan aliran Cimande dan Cikalong, di Jawa Tengah ada aliran Merpati Putih dan di Jawa Timur ada aliran Perisai Diri.\n" +
                    "\n" +
                    "Istilah silat dikenal secara luas di Asia Tenggara, akan tetapi khusus di Indonesia istilah yang digunakan adalah pencak silat. Istilah ini digunakan sejak 1948 untuk mempersatukan berbagai aliran seni bela diri tradisional yang berkembang di Indonesia. Nama \"pencak\" digunakan di Jawa, sedangkan \"silat\" digunakan di Sumatra, Semenanjung Malaya dan Kalimantan. Dalam perkembangannya, kini istilah \"pencak\" lebih mengedepankan unsur seni dan penampilan keindahan gerakan, sedangkan \"silat\" adalah inti ajaran bela diri dalam pertarungan.",
            "Taekwondo (juga dieja Tae Kwon Do atau Taekwon-Do) adalah seni bela diri asal Korea yang juga sebagai olahraga nasional Korea. Ini adalah salah satu seni bela diri populer di dunia yang dipertandingkan di Olimpiade.\n" +
                    "\n" +
                    "Dalam bahasa Korea, hanja untuk Tae berarti \"menendang atau menghancurkan dengan kaki\", Kwon berarti \"tinju\", dan Do berarti \"jalan\" atau \"seni\". Jadi, Taekwondo dapat diterjemahkan dengan bebas sebagai \"seni tangan dan kaki\" atau \"jalan\" atau \"cara kaki dan kepalan\". Popularitas taekwondo telah menyebabkan seni ini berkembang dalam berbagai bentuk. Seperti banyak seni bela diri lainnya, taekwondo adalah gabungan dari teknik perkelahian, bela diri, olahraga, olah tubuh, hiburan, dan filsafat.\n" +
                    "\n" +
                    "Meskipun ada banyak perbedaan doktriner dan teknik di antara berbagai organisasi taekwondo, seni ini pada umumnya menekankan tendangan yang dilakukan dari suatu sikap bergerak, dengan menggunakan daya jangkau dan kekuatan kaki yang lebih besar untuk melumpuhkan lawan dari kejauhan. Dalam suatu pertandingan, tendangan berputar, 45 derajat, depan, kapak dan samping adalah yang paling banyak dipergunakan. Tendangan yang dilakukan mencakup tendangan melompat, berputar, skip dan menjatuhkan, sering kali dalam bentuk kombinasi beberapa tendangan. Latihan taekwondo juga mencakup suatu sistem yang menyeluruh dari pukulan dan pertahanan dengan tangan, tetapi pada umumnya tidak menekankan grappling (pergulatan).",
            "Tinju adalah olahraga dan seni bela diri yang menampilkan dua orang partisipan dengan berat yang serupa bertanding satu sama lain dengan menggunakan tinju mereka dalam rangkaian pertandingan berinterval satu atau tiga menit yang disebut ronde. Baik dalam Olimpiade ataupun olahraga profesional, kedua petinju menghindari pukulan lawan mereka sambil berupaya mendaratkan pukulan mereka sendiri ke lawannya.\n" +
                    "\n" +
                    "Nilai diberikan untuk pukulan yang bersih dan mantap ke bagian depan pinggang ke atas yang sah dari lawan, dengan pukulan ke kepala dan dada mendapat nilai lebih. Petinju dengan nilai yang lebih tinggi setelah sejumlah ronde yang direncanakan akan dinyatakan sebagai pemenang. Kemenangan juga dapat dicapai jika lawan dipukul jatuh dan tidak dapat bangkit sampai hitungan kesepuluh dari wasit (suatu Knockout atau KO) atau jika lawan dinyatakan tidak mampu melanjutkan pertandingan (suatu Technical Knockout atau TKO). Untuk keperluan rekor pertandingan, TKO dihitung sebagai KO.\n" +
                    "\n" +
                    "Kata \"tinju\" adalah terjemahan dari kata Inggris \"boxing\" atau \"Pugilism\". Kata Pugilism berasal dari kata latin, pugilatus atau pinjaman dari kata yunani Pugno, Pignis, Pugnare, yang menandakan segala sesuatu yang berbentuk kotak atau \"Box\" dalam bahasa Inggrisnya. Tinju Manusia, kalau terkepal, berbentuk seperti kotak. Kata Yunani pugno berarti tangan terkepal menjadi tinju, siap untuk pugnos, berkelahi, bertinju. Dalam mitologi, bapak dan Boxing adalah Poliux, saudara kembar dari Castor, putera legendaris dari Jupiter dan Leda.",
            "Wing Chun (mandarin: 詠春; pinyin: yǒng chūn; secara harfiah berarti \"nyanyian musim semi\" atau mandarin: 永春; secara harfiah berarti \"musim semi abadi\"), juga dieja sebagai Ving Tsun atau Wing Tsun adalah seni bela diri Cina dan bentuk bela diri yang mengkombinasikan penyerangan dan pergulatan dan spesialisasi di pertarungan jarak dekat.\n" +
                    "\n" +
                    "Wing Chun adalah sebuah bentuk seni bela diri yang sangat unik, spesialisasi pada pertarungan jarak dekat, memakai pukulan cepat dan tendangan dengan pertahanan yang ketat serta ketangkasan gerak kaki untuk mempercepat gerak maju. Wing Chun yang efektif dapat dicapai dengan kordinasi antara serangan dan pertahanan yang serentak dan serangan balik.\n" +
                    "\n" +
                    "Praktisi Wing Chun harus belajar untuk melontarkan jumlah energi yang tepat dengan keadaan santai. Guru Wing Chun yang baik akan mengajarkan muridnya untuk mengatasi serangan dengan mengatur posisi dan struktur tubuh daripada menghadapi langsung. Gaya Wing Chun meliputi tendangan, menangkis, serangan beruntun, tinju, menjebak dan mengontrol teknik sebagai bagian dari pertarungan.",
            "Wushu (武術 atau 武术, Hanzi: wǔshù) secara harafiah berarti \"seni bertempur/bela diri\". Ini merupakan istilah lain dari kung fu yang lebih dahulu populer, yang berarti \"ahli\" dalam bidang tertentu, sehingga dalam bela diri sering ada istilah wingchun kungfu, hunggar kungfu dan lain-lain, yang artinya ahli wing chun, ahli hunggar dan sebagainya.\n" +
                    "\n" +
                    "Kata Wushu berasal dari dua kata yaitu “Wu” dan “Shu”. Arti dari kata “Wu” adalah ilmu perang, sedangkan arti kata “Shu” adalah seni. Sehingga Wushu bisa juga diartikan sebagai seni untuk berperang atau seni beladiri (Martial Art). Namun seni perang bukan hanya seni gerak badan, tapi mencakup hal yang lebih luas, yaitu seni menggerakan pasukan, mengatur logistik, mengatur strategi dan sebagainya. Jadi untuk Kata Wushu arti yang paling tepat adalah seni beladiri atau Martial Art.\n" +
                    "\n" +
                    "Di dalam wushu, kita juga mempelajari seni, olahraga, kesehatan, beladiri dan mental. Mempelajari Wushu tidak hanya terbatas pada hal-hal yang berhubungan dengan gerakan fisik dan kekerasan saja, tetapi juga melibatkan pikiran. Mempelajari Wushu berarti kita juga belajar mengolah pernafasan, memahami anatomi tubuh kita, dan juga mempelajari ramuan atau obat-obatan untuk memperkuat tubuh maupun untuk pengobatan. Semua aliran kung fu atau Seni bela diri yang berasal dari China tradisional, baik keras atau lembut dapat disebut Wushu. Wushu keras termasuk tinju selatan Nanquan dan tinju panjang Changquan. Wushu lembut termasuk tinju Taiji, Telapak Baguazhang, dan tinju xingyiquan. Adapun seni beladiri Wushu yang telah dikembangkan oleh etnis China yang menetap di wilayah Asia Tenggara (terutama Indonesia) sering kali disebut dengan istilah Kuntao."
    };

    private static int[] martialArtsLogo = {
            R.drawable.jeet_kune_do_logo,
            R.drawable.jiu_jitsu_logo,
            R.drawable.karate_logo,
            R.drawable.kungfu_logo,
            R.drawable.muay_thai_logo,
            R.drawable.pencak_silat_logo,
            R.drawable.taekwondo_logo,
            R.drawable.boxing_logo,
            R.drawable.wing_chun_logo,
            R.drawable.wushu_logo
    };

    private static int[] martialArtsPicture = {
            R.drawable.jeet_kune_do_picture,
            R.drawable.jiu_jitsu_picture,
            R.drawable.karate_picture,
            R.drawable.kungfu_picture,
            R.drawable.muay_thai_picture,
            R.drawable.pencak_silat_picture,
            R.drawable.taekwondo_picture,
            R.drawable.boxing_picture,
            R.drawable.wing_chun_picture,
            R.drawable.wushu_picture
    };

    static ArrayList<MartialArts> getListData(){
        ArrayList<MartialArts> list = new ArrayList<>();
        for(int pos = 0; pos <martialArtsName.length; pos++){
            MartialArts martialArts = new MartialArts();
            martialArts.setNamaBelaDiri(martialArtsName[pos]);
            martialArts.setDetailBelaDiri(martialArtsDetail[pos]);
            martialArts.setLogoBelaDiri(martialArtsLogo[pos]);
            martialArts.setFotoBelaDiri(martialArtsPicture[pos]);
            list.add(martialArts);
        }
        return list;
    }
}
