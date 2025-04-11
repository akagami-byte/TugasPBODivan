


public class Main {
    public static void main(String[] args) {
        // Create player character
        Character player = new Character("Player1", 95, 80);
        System.out.println("Selamat datang, " + player.getName() + "!");
        
        
        // Initialize all 15 scenes (we'll create them in reverse order)
        Scene[] scenes = new Scene[33];

        // Inisialisasi semua scenes dengan deskripsi sementara
        for (int i = 0; i < scenes.length; i++) {
            scenes[i] = new Scene(
                "Temp", "A", "B", "C",
                null, null, null,
                0, 0, 0, 0, 0, 0, scenes
            );
        }

        scenes[32] = new Scene( 
            """
                
                aku berhasil melepaskan cengkeraman mereka, dengan senjata terakhir aku menghempaskan mereka semua dan berlari menuju ruangan
                itu, dengan buru buru kamu berhasil masuk dengan akses kartu itu dan mengunci kembali ruangan keluar. 

                Ruangan itu kosong, benar benar kosong. aku tidak tahu apa yang bisa kamu lakukan. Namun, aku ingat bahwa ayahmu pernah berkata
                "Kebenaran, apapun harganya pasti akan terjadi". Aku tergeletak, tersadar bahwa nyawaku tidak akan lama lagi. Dengan pulpen yang juga
                tergeletak di sampingku, aku mulai menulis apa yang terjadi dari awal hingga akhir termasuk lokasi semua bukti yang ada. Pasukan elit
                terus mencoba mendobrak namun teknologi "Dr.Han" tidak bisa ditembus oleh senjata biasa. Akhirnya, 
                Jadi sudah. aku mengupload file tersebut di Medsos X dan menghembuskan nafas terakhir

                "Nasib terbaik adalah tidak dilahirkan, yang kedua dilahirkan tapi mati muda, dan yang tersial adalah umur tua. 
                Rasa-rasanya memang begitu. Bahagialah mereka yang mati muda" 
                ~Soe Hok Gie


                THE END (ENDING: Catatan seorang Demonstran)

            """, null, null, null, null, null, null, 0, 0, 0, 0, 0, 0, scenes);

        scenes[31] = new Scene(
            """

                Dengan teriakan terakhirku, akhirnya Juhee datang menghampiriku. Aku cukup senang dengan kehadirannya Ju-hee mengeluarkan
                pistolnya dan seketika ia mengarahkan pistolnya. Aku dengan nafas terakhir akhirnya bisa melihat detik detik presiden
                ditembak di depan kepalaku. "DORRR", suara itu terdengar keras ke seluruh penjuru ruangan, namun anehnya dengan napas terakhir
                aku tidak melihat darah keluar dari kepala presiden. Malahan ia tersenyum 
                "Bagus, Han, kamu memang anggota militerku yang terbaik" 
                "Maaf Min-hee, Masyarakat butuh diatur dengan patuh " lanjutnya "Ga ada yang lebih indah dari kekuasaan bukan? Ha Ha Ha" 

                
                THE END (ENDING: Anjing lebih disukai manusia dibandingkan gelandangan)

            """, null, null, null, null, null, null, 0, 0, 0, 0, 0, 0, scenes);

        scenes[30] = new Scene(
            """
                
                Aku kalah, tidak sampai sepersekian detik aku mencoba memukul kembali presiden Kang. Pasukan elit telah menebas kepalaku
                sepenuhnya. "Maaf ayah, ini adalah akhir"

                THE END (ENDING: Lose from Anger)

            """, null, null, null, null, null, null, 0, 0, 0, 0, 0, 0, scenes
        );

        scenes[29] = new Scene(
            """

                Sampailah aku di ruangan presiden, "KANG!!, AKU KEMARI UNTUK MEMBALASKAN DENDAMKU "amarah bergejolak dalam diriku, tanpa belas
                kasih aku langsung mencoba menyergap presiden, namun tanpa sadar, pasukan pengawal dengan sigap menghunuskan pedangnya kepadaku.
                Darah mengucur deras dari tubuhku. aku lemas tidak berdaya. AKu mencoba berpikir bagaimana aku bisa menyerangnya. Seketika 
                aku teringat ada kartu Dr.Han di dalam sakuku. ku tengok disamping, benar, ada pintu canggih yang hanya bisa diakses dengan kartu,
                 "Ini adalah energi terakhirku, aku akan mengerahkan tenaga terakhirku untuk..." 
                

            """, "Serang dia secara terus menerus", "Meminta bantuan Ju-hee", "Lari sekuat tenaga untuk membuka ruangan tersebut (wajib ada item kartu)", null, null, null, 0, 0, 0, 10, 0, 0, scenes
        );

        scenes[28] = new Scene(
            """
                Malam itu, aku menyusup ke markas mereka. Malam itu. para petinggi menyiapkan rapat sebelum besok adalah hari dimana
                serum akan dilepaskan gas ke seluruh kota. Aku sempat mengecek Ponsel melihat sekian banyak postingan Medsos yang membahas       
                serum ini sebagai penyelamat manusia. Pemerintah telah berhasil memanipulasi seluruh media dan mempercantik citra serum tersebut
                Satu dua diantara komentar sempat skeptis dan kritis atas kebijakan tersebut. Sayang satu komentar kritis dibalas belasan buzzer 
                yang sudah tergiur oleh uang haram. "Hahh..." aku hanya bisa menghela napas. New Republic katanya. Tapi yang terjadi ialah
                keditaktoran satu penguasa yang tidak puas dengan kekuasaan yang ada dan tentunya Anti kritik!

                Aku mencoba memasuki pintu utama, berhasil! tidak apa siapa siapa. "Kenapa sepi sekali" pikirku. Aku lanjut masuk ke pintu pintu
                selanjutnya. Namun ketika di pintu kelimat. Seseorang langsung melemparkan pisau ke arahku. Aku panik, pikirku mungkin dia salah 
                melempar, mari bersembunyi dahulu tapi nahas. Pasukan elit presiden langsung menyerangku. Aku harus menyerang mereka tapi semakin
                lama, satu persatu pasukan elit datang berganti. Aku kewalahan. Tiba tiba pasukan underworld datang membantu. Ju-hee selaku wakil
                Undwerworld dengan sigap membantuku. "Tenang saja, mereka disini, pergi duluan!"
            """, "Bantu Ju-hee menyerang pasukan elit", "Pergi", null, null, null, null, 10, 0, 0, 10, 5, 0, scenes
            );
            scenes[28].setmusuh("Pasukann elit", 100);

        scenes[27] = new Scene( //scene untuk 
            """
               "Oke, dengarkan rencanaku, kita akan menyusup ke markas mereka. Untuk awal, aku akan mengtusmu dan Ju-hee. Sepertinya saat ke 
               sini kalian sudah saling berbincang sedikit sebelumnya ya haha", disusul kawan kawan lain yang tertawa kecil. "Dia adalah 
               prajurit terbaik kami" ikutlah bersamanya. Setelah itu pemimpin menjelaskan detail renacananya dan malam itu pun kami bersiap siap
            """, "Siapkan diri", "Periksa sekitar lalu mengambil pistol", null, null, null, null, 0, 0, 0, 12, 7, 0, scenes
            );

        scenes[26] = new Scene(
            """
                
                "Min-HEE!!, TENANGLAH" teriak pemimpin. jika kamu tidak bisa tenang maka usaha kamu, kami semuanya akan sia sia! 
                "Untuk apa? Kenapa aku harus tenang? Ayahku sudah mati! Dia dibunuh oleh orang yang tidak bertanggung jawab Aku akan
                speak up di media sosial. Netizen akan membantuku untuk mengungkapkan kebenaran!."
                "Percuma saja, mereka tidak akan percaya padamu. sebagian dari Mereka sudah terkontrol oleh proyek MASSA. Dan kamu mau tahu
                fakta yang lebih mengejutkan? banyak dari mereka yang sebenarnya belom terkena serum tersebut namun tetap membela karena
                apa? Tidak lain TIDAK BUKAN IALAH UANGG! MANUSIA TIDAK AKAN PERNAH PUAS JIKA mereka tidak pernah merasa cukup dan haus akan
                kekuasaan dan uang"

                "Jika kamu memang keras kepala, silahkan ke koordinat ini, ini adalah koordinat langsung ke markas mereka, kau bisa membunuh 
                mereka semua dan itu tidak akan menyelesaikan apapun percayalah!"
            
            """, "Dengarkan rencana dia", "Ambil secarik koordinat lalu pergi", null, null, null, null, 0, 0, 0, 10, -20, 0, scenes
            );
        
        scenes[25] = new Scene(
            """

                Ayahmu tidak salah! awalnya ia hanya meneliti bagaimana hubungan psikis bisa diatur dengan zat khusus. Zat ini ialah
                zat penenang sekaligus dapat mendoktrin seseorang untuk mengikuti perintah pemberi zat dalam kurun waktu 10 menit. awalnya 
                hanya digunakan untuk medis dan digunakan untuk mensugesti pasien yang memiliki gejala kejang hebat dan diatur dengan dosis
                yang ketat. Zat ini berbentuk gas dan cair. suatu ketika terjadi kebocoran gas zat ini dan ibumu terkena gas tersebut untuk
                menyelamatkan para ilmuwan disana. Ibumu yang merupakan ilmuwan jenius nekat untuk mensutikkan antidote ke dalam tubuhnya
                Sayangnya, antidote tersebut juga produk gagal dan akhirnya merenggut nyawanya. Ayahmu sangat terpukul dan berusaha untuk
                meminta pertolongan. Menteri Han yang merupakan sahabat ayahmu berusaha untuk membantu ayahmu. Sayang, ia dikecam oleh pihak
                pemerintah jika tidak membocokan projek tersebut dan membuka kasus korupsi timah 300T di tahun 2008. Bukannya membantu, 
                Han dengan tega mengkhianati ayahmu dan membocorkan semua kegiatan penelitian ayahmu ke pihak pemerintah. 

                Semenjak saat itu, ayahmu bertekad untuk menjadi jurnalis diam diam dan bergabung dengan Media Hwasan. Dalam media kami
                ada divisi khusus untuk investigasi kasus busuk pemerintahan yang kami sebut dengan "Tempo" dan mengungkap semua kebohongan 
                pemerintah. Namun yang terjadi, suatu ketika ia berhenti dari Tempo dan menghilang selama 2 tahun semenjak itu kami rasa ia 
                sudah mati. Kami tidak tahu apa yang terjadi padanya. Kami hanya bisa menunggu dan berharap ia kembali.
                Oh iya dulu saat ia menjadi jurnalis "Tempo" ia mengubah namanya menjadi sahabatnya yaitu menteri "Han" agar tersamarkan

                Sekarang maukah kamu mendengarkan rencanaku?

            """, "Menghela napas dan mempercayai segalanya", "Menenangkan diri kembali dan mendengarkan rencananya", "Setengah percaya tapi dengarkan rencananya", null, null, null, 0, 0, 0, 0, 0, 0, scenes
            );

        scenes[24] = new Scene(
            """

                Setelah berjam jam menunggu, akhirnya kapal sampai di sebuah pelabuha. Baru saja aku turun, aku melihat pemuda dengan penuh 
                wajah goresan. Dia datang menghampiriku dan berkata "Kau Min-hee kan? Perkenalkan aku Hae-sung. Aku adalah pemimpin dari
                Underworld. Kau datang tepat waktu. Kami sudah menunggu kedatanganmu.

                Seperti yang kau lihat, kami adalah organisasi yang berjuang untuk mengungkap kebenaran di balik proyek MASSA. Kami semua
                adalah korban dari proyek ini. Kami sudah berusaha untuk mengungkapkan kebenaran tapi kami tidak bisa melakukannya sendirian.
                "Tapi apa hubungannya?" Timpalku. "Bukankah project MASSA itu hanya proyek penelitian untuk mengontrol masyarakat, kalau
                masyarakat tahu tentang hal ini, akan terjadi kehebohan hebat dan kita mudah mengungkapkan fakta?"

                "Sayangnya, tidak semudah itu. Proyek ini sudah berjalan selama 20 tahun dan sudah banyak orang yang terlibat di dalamnya." dan
                kenapa ayahmu bisa tahu tentang hal ini? Dia adalah salah satu orang yang terlibat di dalamnya. Dia adalah orang yang pertama kali
                mencetuskan ide mengenai serum ini. "TIDAK MUNGKIN!" teriakku. "Ayahku tidak mungkin melakukan hal itu. Dia adalah orang yang baik, 
                dia tidak bersalah." "Min-hee, dengarkan dahu-" 

            """, "Rileks dan lanjut mendengarkan", "Memukul pemimpin", "Kabur", null, null, null, 0, 0, 0, 0, 0, 0, scenes
            );

        scenes[23] = new Scene(
            """

                Maaf telah membuatmu tidak nyaman. Perkenalkan aku Ju-hee, teman ayahmu. "Aku sudah menunggu lama untuk bertemu 
                denganmu. Ayahmu adalah orang yang baik, dia tidak bersalah. Aku akan membantumu untuk menemukan kebenaran."
                Banyak hal yang ingin kuketahui, tapi dilihat dari tatapan Ju-hee, aku tahu dia tidak bisa memberitahuku banyak hal. 
                "Jadi, siapa sebenarnya kamu? Kenapa kamu bisa tahu tentang ayahku?" Ju-hee menggelengkan kepala. "Dulu aku merupakan 
                jurnalis yang sering meliput ayahmu namun karena aku juga korban projek MASSA tapi sekarang aku hanyalah anggota Underworld. 
                Maaf, aku tidak bisa memberitahumu banyak hal. Kita harus pergi ke Galangan kapal sekarang."

            """, "Pegang tangannya dan mulai mempercayainya", "Berpura pura mempercayainya dan ikuti Ju-hee", "", null, null, null, 0, 0, 0, 0, 5, 7, scenes
            );

        scenes[22] = new Scene(
            """

                Dokumen di laci hangus, tapi aku selamatkan secarik kertas: 
                "Proyek Naga: Kendalikan masyarakat melalui: 1. "Tunduk" 2. Media 3. mAk- k-ta -Kan ____". 
                Bagian terakhir terlalu hangus untuk dibaca.    

            """, "Ambil foto sisa dokumen ", "Cari petunjuk lain di ruangan", "Kabur sebelum ketahuan", null, null, null, 0, 0, 0, 8, 5, 0, scenes
        );

        scenes[21] = new Scene(
            """

                Surat yang belum selesai ini bergetar di tanganmu. 
                "Jika aku mati, cari Sdr. Han di akademi militer. Dia satu-satunya yang tahu kebenaran tentang Kang. 
                Kita semua telah dikhianati..." Ada noda darah di sudut kertas.

            """, "Bawa surat ini", "Hafalkan isinya lalu bakar", "Buat salinan untuk Underworld", null, null, null, 0, 0, 0, 15, 5, 10, scenes
            );

        scenes[20] = new Scene(
            """

                Kartu akses ini bertuliskan "Akses Khusus - Basement Menara Eclips. Pemegang: Dr. Han". 
                Di baliknya ada coretan: "Jangan percaya siapapun. Mereka bertebaran dimana saja."

            """, "Ambil kartu dan kembali melihat flashdisk", "Ambil kartu dan kembali mencari dokumen", null, null, null, null, 0, 0, 0, 10, 5, 8, scenes
            );
        scenes[20].setSceneItem("A", "Kartu Akses");
        scenes[20].setSceneItem("B", "Kartu Akses");

        scenes[19] = new Scene(
            """

                Foto-fotomu menangkap truk militer mengangkut peti dari gudang. Saat ku zoom, plat nomornya sama dengan 
                kendaraan dinas presiden, Tiba tiba ada pekerja berbisik: "Mereka dateng tiap akhir bulan..."  
                     
            """, "Lacak rute truk", null, null, null, null, null, 0, 0, 0, 10, 7, 12, scenes
            );

        scenes[18] = new Scene(
            """

               Dokumen ini berisi daftar nama politik dengan kolom "Hasil Eksperimen". 
               Catatan terakhir: "Fase militer dimulai. Subjek menunjukkan ketaatan mutlak setelah injeksi KANG-01."         
               Kamu tahu, daftar politisi ini adalah tokoh yang pernah membawa negara ke titik puncak kejayaan New Republic.
               " "Kang So Mik", dia kan adik dari Jendral Kang yang dulu pernah menjadi presiden New Republic, setahuku dulu dia
               bersitegang dengan jendral Kang"

            """, "Bawa ke kantor polisi", null, null, null, null, null, 0, 0, 0, 12, 8, 5, scenes
            );

        scenes[17] = new Scene(
                """

                    Flashdisk itu mengeluarkan asap hitam saat aku hancurkan. Ternyata itu perangkat pelacak! 
                    Suara derap sepatu berduri sudah di depan pintu.   

                """, "Kabur lewat jendela belakang", "Hadapi penyusup", "", null, null, null, 0, 0, 0, 10, -3, 7, scenes
            );

        scenes[16] = new Scene(
            """

                Ponselmu bergetar saat upload foto ke cloud. "Upload gagal. Jaringan terputus."
                Ponselmu tiba-tiba panas saat upload mencapai 99%. Peringatan muncul: "Jaringan diawasi oleh sistem keamanan nasional".
                Dari jendela, ku lihat ada mobil hitam tanpa plat berhenti di depan rumah. Saat aku perhatikan plat itu, "plat itu tidak asing
                tapi kenapa aku tidak bisa mengingatnya. Namun tanpa disangka seseorang datang mencengkram tanganku dan berkata
                "Ikut aku! Mereka sudah datang!" belum sempat aku bertanya, ia langsung menarikku ke luar rumah. 

            """, "Tarik lengannya dan pergi ke koordinat yang diberikan ayahmu", "Ikuti koordinat ayah", "Kembali untuk membaca dokumen selanjutnya", null, null, null, 0, 0, 0, 8, 0, 10, scenes
            );
            scenes[16].setSceneItem("A", "Ju-hee");

        scenes[15] = new Scene(
            """

                Gudang ini penuh peti kayu bergambar Kepala babi. Saat aku paksa buka, isinya adalah senjata illegal 
                dengan stempel "Milik Negara - Untuk Latihan". Dokumen di meja bertuliskan: 
                "Pengiriman tahap 7 untuk Operasi Naga. Disetujui oleh: Jendral Kang. 
                Catatan: Berikan 20% ke Underworld sebagai umpan." 
                
                "Dunggg" bunyi kapal sudah mulai berlayar. Sepertinya Kapal tersebut adalah tujuan markas Underworld, aku tidak boleh
                ketinggalan!"

            """, "Ambil dokumen", "Foto semua bukti", "Sabotase pengiriman", null, null, null, 0, 0, 0, 15, 10, 12, scenes
            );

        scenes[14] = new Scene(
            """

                Dari celah lemari, aku lihat Geomdo menggeledah dapur dengan wajah geram. "Bos tidak mau ada bukti yang bocor!" 
                Saat ia membuka jaketnya, aku melihat lencana militer tersembunyi di baliknya! Seorang anak buahnya berbisik: 
                "Jendral marah kalau proyek ini terbongkar..."    

            """, "Serang mereka saat lengah", "Tunggu sampai pergi", "Lempar kaleng sebagai gangguan", null, null, null, 0, 0, 0, 0, 5, 3, scenes
            );

        scenes[13] = new Scene(
            """
                Aku lari masuk ke dalam ruangan sempit. Akhirnya aku berhasil lari dari mereka. Aku tiba di sebuah bunker
                Lorong sempit ini menuju gudang bawah tanah yang lembab. Rak-rak berisi botol-botol kaca bertuliskan "MASSA-01" 
                dan suntikan berisi cairan biru. Di sudut, ada meja dengan buku log: "Subjek uji coba #47 menunjukkan peningkatan kepatuhan 80%".
                "Subjek uji coba #48 menunjukkan peningkatan kepatuhan 90%." Kurasa ini adalah lab mereka dalam melakukan percobaan mereka. 
                "Apa ini? Apakah ini yang disebut proyek MASSA?" pikirku. Aku membaca program ini dengan seksama. Aku tidak bisa berkata kata,
                bagaimana mungkin mereka yang disebut pelindung rakyat melakukan hal ini?
                Di atas meja, ada kunci cadangan untuk peti khusus. Di sampingnya ada koordinat 
            """
            , "Ambil sampel cairan lalu pergi", "Foto dokumen buat bukti lalu pergi", "Tinggalkan tanda untuk Underworld", null, 
            null, null, 0, 0, 0, 7, 5, 3, scenes
        );

        scenes[12] = new Scene(
                """

                    Atasan polisi tiba-tiba marah saat ku tanya soal simbol naga. "Itu cuma dongeng!" Tapi di laci bawah mejanya,
                    ku lihat stempel logam persis seperti simbol itu. Ada tulisan "Proyek MASSA - Divisi Khusus". 
                    Tapi salah seorang polisi menyelipkan sepotong kertas ke saku jaketmu ketika lewat: 
                    "Pergi sebentar ke toilet polisi" sambil berbisik
                    "Jangan percaya kami... tapi yang terpenting ialah jangan percaya militer juga." 

                """, "Labui polisi sambil ambil stempel diam diam", "Videokan diam diam dan pergi ke toilet", "Langsung lari ke toilet",
                null, null, null, 0, 0, 0, 10, 5, -15, scenes
        );

        scenes[11] = new Scene(
            """
                
                Ruangan arsip polisi gelap dan berdebu. File ayahmu diberi stiker "TUTUP". Saat ku buka, laporan palsu bertuliskan 
                "Kecelakaan Tunggal" itu ternyata disisipi foto asli: ayahmu terbaring di jalan dengan luka tembak di kepala, 
                dikelilingi orang berseragam hitam bertopeng. Seketika ada suara langkah kaki mendekat. Aku sigap memegang senjataku "Hupp-"
                "Woww, santai gadis! Aku bukan musuhmu!" Seorang polisi muda muncul dari balik rak arsip. "Aku tahu siapa yang membunuh ayahmu.
                "Maaf aku tidak bisa bicara banyak kepadamu karena kantor disini sudah menjadi subjek percobaan MASSA, tapi aku sudah 
                sedikit menuliskan petunjuk untukmu di atas ventilasi toilet. Cepat pergi sebelum mereka datang!"

            """, "Percaya dengan polisi tersebut dan pergi ke toilet", "Langsung pergi ke toilet", "Hajar polisi seketika lalu kabur", null, null, null, 0, 0, 0, 10, 5, -5, scenes
        );

        scenes[10] = new Scene(
            """ 

                Di toilet kantor polisi, aku baca nota itu: "Serum Final sudah ada di tangan mereka, aku yakin mereka juga telah memproduksi 
                secara massal. Kawanku, Jangan percaya siapa pun. Mereka ada di mana-mana. jika hari itu telah tiba datanglah ke tempat itu"
                Ada secoret kertas berisi kordinat. "Aku yakin ini markas mereka, Mari persiapkan semuanya" dan juga Ada gambar kecil simbol 
                Kepala babi dengan coretan melingkarinya. Aku membuka sekilas Nota tersebut. "Halo, Min-hee. Aku adalah wanita eksentrik di 
                pertemuan kita kemarin. Kamu membutuhkan bantuan, Jika kamu ingin tahu lebih tahu banyak, datanglah ke Galang kapal"   

            """, "Pergi ke koordinat yang dimaksud", "Pergi ke Galang kapal dan bertemu wanita itu", "",
            null, null, null, 0, 0, 0, 10, 5, -5, scenes
        );

        scenes[9] = new Scene(
            """

                Laci besi ini punya sistem penguncian digital. Di atasnya ada foto ayahmu 
                dengan seseorang yang wajahnya sengaja dirobek. Ada stiker kecil bertuliskan "KANG-01" di sudut foto. "Mungkinkah ini 
                adalah presiden yang sekarang baru akan dilantik?" pikirku. "Tapi kenapa ada foto ayah disini?. Di bawah laci ini 
                terdapat tulisan "Jangan serang, mulai dari hati". Aku ingat, ini adalah bentuk permainan kata yang sering diucapkan
                ayahku untuk mengisyaratkanku ketika ibuku sering memukuliku. Yah ini cerita lama tapi setelah itu ayah selain menjadi jurnalis
                sebenarnya juga mantan Psikiater selama 2 tahun. Dia ingin tahu bagaimana menyembuhkan penyakit keras kepala ibuku. 
                Ayahku berkata bahwa dulu ibuku tidak seperti itu, dia mengatakan bahwa ibuku dulunya sangat ramah, tapi semua berubah 
                malam itu ketika ibu diculik selama 3 hari dan dikembalikan tanpa sebab. Tidak ada luka, tidak ada tanda apa pun yang 
                mengindikasikan ibuku telah diculik. Ayahku mengatakan bahwa ibu tidak pernah sama lagi setelah itu. Dia menjadi galak, 
                tempramental dan tidak pernah mau mendengarkan. 

                Aku tahu kode ini, tapi aku tidak tahu apakah ini kode untuk membuka laci atau bukan.
            """  
        , "Coba buka kode dengan teliti", "Paksa buka pakai alat", "Tinggalkan", 
        null, null, null, 0, 0, 0, 6, 3, 0, scenes
            );

        scenes[8] = new Scene (
            """

                Di antara tumpukan berkas, kanu menemukan map cokelat bertuliskan "Proyek Massa". Saat dibuka, 
                ternyata isinya adalah laporan media yang dicoret dengan kode-kode aneh dan foto-foto pria lusuh di sebuah Bunker. 
                "Media Televisi Metra = terkendali" "Media Harian Seong = terkendali" "Media Harian Hwasan = Darurat!"
                "Media Harian Hwasan? Itu kan media yang sering memberitakan tentang ayahku.


            """,  "Bawa dokumen", "Foto dengan ponsel", null,
            null, null, null, 0, 0, 0, 7, 5, 0, scenes
        );

        scenes [7] = new Scene(
            """

                Laptop menampilkan video ayahmu yang direkam diam-diam. 
                "Min-hee, jika kamu melihat ini, artinya aku sudah wafat. Ayah percaya kamu adalah bagian takdir untuk perubahan
                negara ini kedepannya. Proyek MASSA bukan sekadar siapa, ini tentang mengontrol kebebasan rakyat. Demokrasi berada 
                dalam ancaman. Tidak akan ada lagi kebebasan berpendapat. Ayah tidak bisa memberikan detailnya kepadamu, carilah tahu siapa yang terlibat. Kamu akan dibantu oleh "teman-teman ayah". 
                Menteri Han adalah—" Tiba tiba rekaman terputus Tapi ada koordinat lokasi di layar. "Mengontrol kebebasan rakyat?
                Apa maksudnya? Kenapa ayahku bisa tahu tentang ini? Lalu siapa yang dimaksud ayah yang akan membantuku" 
                Setelah video berakhir, hanya muncul titik koordinat 

            """, "Catat koordinat", "Salin file ke cloud", "Hancurkan flashdisk",
            null, null, null, 0, 0, 0, 10, 8, 0, scenes
        );

        scenes[6] = new Scene(
            """

                Kamuu menerobos pintu menuju. Tukang masak yang bertato naga di lengannya terkejut melihatku. 
                Ia melihatmu dengan senyuman aneh sambil mengasah pisau tajam di tangan. Ia mulai mendekatiku secara perlahan
                Note: Mengalahkan musuh akan mendapatkan XP tambahan tapi scene akan kembali ke sini selama musuh belum mati

            """
        , "Hadapi tukang masak", " Cari ruangan lain ", null,
         null, null, null, 2, 0, 0, 5, 5, 3, scenes
         );
         scenes[6].setmusuh("Koki aneh", 10);

        scenes[5] = new Scene (
            """

                Geomdo tertawa melihatku. "kau yakin mau lawan Underworld dengan kemampuanmu?!
                Anak buahnya mengepung dengan pistol dan pisau. Aku panik tidak karuan, 
                Tanganku yang sedang memegang Senjata bergetar hebat. Ini pertama kalinya aku menggunakan senjata. 
                Tanpa belas kasih mereka langsung menyerang. Aku terjatuh ke tanah. Salah satu menarik lenganku tapi berhasil kulepas.
                Dalam persekian detik aku berhasil mengambil rifle mereka dan menembaknya. "ARGGHHH" ini pertama kalinya aku memegang pistol
                Telingaku pengang, bahuku melontarkan sakit nyeri yang luar biasa. Di depanmu terlihat Geomdo siap menghajarmu

                Note: Mengalahkan musuh akan mendapatkan XP tambahan tapi scene akan kembali ke sini selama musuh belum mati

            """, "Serang dengan senjatamu", "Sembunyi di lemari", "",
            null, null, null, 10, 5, 5, 2, -10, 0, scenes
        );
        scenes[5].setmusuh("Geomdo", 20);

        scenes[4] = new Scene (
            """
                
                Pertarungan tidak dapat terhindari, Geomdo melihatmu, Sebelum menghadapi Geomdo, ku mengamati sekeliling untuk senjata. 
                Bartender tua mengangguk ke arah gudang kecil di belakang bar.Geomdo tertawa melihat senjataku. 
                "kau mau lawan Underworld dengan tangan kosong?!" Dia melemparkan meja ke arahmu, botol-botol pecah berhamburan. 
                Di sana, di antara botol minuman palsu dan kotak uang, tersimpan beberapa pilihan:    
                1. Pisau belati dengan gagang kayu yang sudah usang, tapi mata pisau masih mengkilap tajam. Senjata sunyi yang mematikan.
                2. Pistol semi-otomatis dengan peluru penuh, tapi suara tembakan bisa menarik perhatian.
                3. Taser gun dengan daya listrik tinggi, bisa membuat lawan terkejut, tapi tidak mematikan.

            """, "Ambil pisau belati", "Ambil pistol", "Ambil Taser gun", null, null, null, 0, 0, 0, 0, 0, 0, scenes
        );
        scenes[4].setSceneItem("A", "Pisau");
        scenes[4].setSceneItem("B", "Pistol");
        scenes[4].setSceneItem("C", "Taser gun");



        scenes[3] = new Scene(
            """

                Ruangan polisi ini bau kopi basi dan keringat. Hawa panas ruangan ini membuatku tidak nyaman. Para polisi tua menatap dengan 
                tatapan yang tajam membuat Min-hee makin tidak nyaman. "Kasus ayahmu sudah ditutup, nak. Kematian alami," 
                kata seorang perwira dengan suara yang terlalu keras untuk ukuran ruangan kecil ini. aku melihat sekeliling,
                "Ada yang tidak beres di sini. Kenapa ada simbol Kepala babi di dinding? Kenapa semua orang terlihat ketakutan?"

            """, "Baca nota diam-diam", "Minta file investigasi resmi", "Tanya tentang simbol Kepala babi",
            null, null, null, 0, 0, 0, 5, -15, -5, scenes
            );

        scenes[2] = new Scene(
            """ 

                Jauh sekali perjalanan ini, aku sudah sampai di pedalaman distrik Hwasan. 8 jam perjalanan darat dan 3 jam mendaki?
                Yang benar saja, harus ada sesuatu yang kutemukan disini! Kantor tua di pedesaan ini berantakan seperti sudah 
                ditinggal beberapa bulan atau tahun?. Kursi terguling, berkas-berkas berserakan, dan foto keluarga di meja telah dicoret 
                dengan tinta merah membentuk simbol babi. Komputer utama hilang, tapi ketika Min-hee membalik papan tulis kecil di sudut
                ruangan, sebuah flashdisk jatuh, masih ada tulisan "Untuk Min-hee" dalam tulisan tangan ayahnya. Di luar jendela, 
                hujan mulai turun. "Bagaimana mungkin! kenapa ada tulisan ayah disini"

            """, "Cari dokumen lain di antara tumpukan kertas", "Colokkan flashdisk ke laptop pribadimu", "Periksa laci meja yang terkunci", null, null, null, 0, 0, 0, 8, 5, 3, scenes
            );

        scenes[1] = new Scene(
            """ 

                Lampu neon klub ini terasa sangat silau di mataku. Ini pertama kalinya aku masuk ke klub. Tempatnya jauh dari kota Incheon 
                "Tapi kenapa ramai sekali yah" Musik elektronik yang keras membuat dada bergetar, "Cocok untuk nyembunyiin sesuatu" pikirku. 
                Preman-preman bertato Kepala babi di leher mereka meminum sesuatu yang bukan alkohol dari gelas kristal. 
                Di bar, Geomdo, laki laki bongsor itu duduk tenang sambil melihat sebuah foto. Kamu mencoba mendekatinya, 
                Geomdo yang melihatmu memakai jaket ayahmu langsung terkaget dan membisikkan sesuatu ke telingamu: "Kamu harus pergi sekarang."
            
            """, "Tantang Geomdo langsung (+10xp)", "Diam meninggalkan ruangan dan Cari senjata ", "Pergi ke ruangan lain (+5xp)", 
            null, null, null, 0, 0, 0, 10, 0, 5, scenes
            );

        scenes[0] = new Scene(
            """

                Foto ayah, Min-jae, politisi sekaligus peneliti yang terkenal membagikan buku dan makanan 
                untuk anak-anak jalanan—tersenyum dalam bingkai hitam yang terlalu besar 
                untuk seorang yang dikabarkan "mati karena serangan jantung biasa".  
                hampir 5 tahun sudah berlalu, walau sudah lama, sebenarnya aku masih penasaran bagaimana kasus ini berlanjut.
                Hanya jaket ini yang masih tersisa dari ayahku dan masih kupakai sampai saat ini.

                "Untuk menghadapi 'mereka', kami akan segera memberantas untuk kedamaian negara kita. sekian.." aku mulai mengantuk
                menghadiri konferensi pers ini. Yang benar saja! Sudah 5 jam aku menunggu presiden keluar untuk meminta keterangan tapi hanya 
                sepatah dua kata saja yang keluar, Sebell! "Udah semangat ngeliput, Min-hee, job pertama jadi jurnalis ga boleh ngeluh!" timpal 
                rekanku. Aku menghela napas, aku melihat sekitar lalu seketika aku dihampiri oleh wanita aneh. Penampilannya norak tapi 
                cantiknya luar biasa! Tanpa ragu ia langsung berbisik kepadaku "Apa kamu anak dari Min-jae?, jika ya ikuti aku sampai teras",
                Kaget bukan main,tapi aku rasa wanita aneh ini punya rahasia tentang ayahku. Aku pamit ke rekanku dan mengikuti wanita aneh itu. 
                
                Baru saja sampai teras, ia membalikkan badannya dan menyerahkan
                secarik kertas. "Ini untuk kamu, anaknya. Aku adalah jurnalis "Tempo" kawan lama ayahmu. Jangan begitu percaya yang di 'bawah', 
                tapi diatas itu jangan pernah percaya 'kepala babi' dan "mereka". Lalu dibawahnya ia memberi foto sebuah kantor polisi sudah 
                usang di distrik Hwasan. Ia juga memberi sebuah alamat kantor tua dekat dari sini. Sebelum aku selesai, ia membisikkan kepadaku 
                "Kalo mau langsung terjun, klub ini adalah awal dari perjalananmu" sambil menunjuk foto. Terakhir ia mengatakan "Setelah ini 
                jangan mencariku karena aku akan "didiamkan" " Ia langsung pergi begitu saja. 
                
                "Kurasa ini adalah petunjuk, aku harus siap dengan segalanya" firasatku mengatakan bahwa kasus ayah akan terungkap dan ini?
                sepertinya akan mengungkap hal yang besar

            """, "Pergi ke klub (+5 xp)", "Pergi ke kantor tua untuk mencari petunjuk (+3 xp)", 
            "Cari tahu kebenaran di kantor polisi (-10 xp)", null, null, null, 0, 0, 0, 5, 3, -10, scenes
        );

        scenes[0].setNextScenes(scenes[1], scenes[2], scenes[3]); //fix
        scenes[1].setNextScenes(scenes[5], scenes[4], scenes[6]); //fix
        scenes[2].setNextScenes(scenes[8], scenes[7], scenes[9]); //fix
        scenes[3].setNextScenes(scenes[10], scenes[11], scenes[12]); //fix
        scenes[4].setNextScenes(scenes[5], scenes[5], scenes[5]); //fix
        scenes[5].setNextScenes(scenes[14], scenes[14], scenes[14]); //fix
        scenes[6].setNextScenes(scenes[4], scenes[4], scenes[4]); //fix
        scenes[7].setNextScenes(scenes[15], scenes[16], scenes[17]); //fix
        scenes[8].setNextScenes(scenes[18], scenes[19], null); //fix
        scenes[10].setNextScenes(scenes[28], scenes[23], null); //fix
        scenes[11].setNextScenes(scenes[10], scenes[10], scenes[10]); //fix
        scenes[12].setNextScenes(scenes[10], scenes[10], scenes[10]); //fix
        scenes[13].setNextScenes(scenes[20], scenes[20], scenes[20]); //fix
        scenes[14].setNextScenes(scenes[13], scenes[13], scenes[13]); //fix
        scenes[15].setNextScenes(scenes[24], scenes[24], scenes[24]); //fix
        scenes[16].setNextScenes(scenes[23], scenes[28], scenes[21]); //fix
        scenes[17].setNextScenes(scenes[23], scenes[23], scenes[23]); //fix
        scenes[18].setNextScenes(scenes[3], null, null); //fix
        scenes[19].setNextScenes(scenes[28], null, null); //fix
        scenes[20].setNextScenes(scenes[7], scenes[8], null); //fix
        scenes[21].setNextScenes(scenes[22], scenes[22], scenes[22]); //fix
        scenes[22].setNextScenes(scenes[19], scenes[19], scenes[19]); //fix
        scenes[23].setNextScenes(scenes[15], scenes[15], scenes[15]);
        scenes[24].setNextScenes(scenes[25], scenes[26], scenes[26]); //fix
        scenes[25].setNextScenes(scenes[27], scenes[27], scenes[27]);
        scenes[27].setNextScenes(scenes[28], scenes[28], scenes[28]);
        scenes[28].setNextScenes(scenes[29], scenes[29], null);
        scenes[29].setNextScenes(scenes[30], scenes[31], scenes[32]);


        Story adventure = new Story(scenes, player);
            
        adventure.start();
    };
};