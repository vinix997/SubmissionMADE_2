package com.example.submission_2;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class TVFragment extends Fragment {
    private ArrayList<TVShow> listShow;
    private RecyclerView mRecyclerView;


    public TVFragment() {
        // Required empty public constructor
    }

    private static ArrayList<TVShow> tvData() {
        ArrayList<TVShow> dummyShow = new ArrayList<>();
        TVShow tvShow = new TVShow();
        tvShow.setImage(R.drawable.poster_dragon_ball);
        tvShow.setTitle("Dragon Ball");
        tvShow.setDateStart("February 26, 1986");
        tvShow.setDateEnd("April 19, 1989");
        tvShow.setEpisode("153 episodes");
        tvShow.setDescription("Dragon Ball (Japanese: ドラゴンボール Hepburn: Doragon Bōru) is a Japanese anime television series produced by Toei Animation. It is an adaptation of the first 194 chapters of the manga of the same name created by Akira Toriyama, which were published in Weekly Shōnen Jump from 1984 to 1988. The anime is composed of 153 episodes that were broadcast on Fuji TV from February 26, 1986, to April 19, 1989. It was broadcast in 81 countries worldwide.[2] It is part of the Dragon Ball media franchise.");
        dummyShow.add(tvShow);

        tvShow = new TVShow();
        tvShow.setImage(R.drawable.poster_naruto_shipudden);
        tvShow.setTitle("Naruto Shippuden");
        tvShow.setDateStart("15 Februari 2007");
        tvShow.setDateEnd("23 Maret 2017");
        tvShow.setEpisode("504 episodes");
        tvShow.setDescription("Naruto Shippuden adalah sebuah seri anime yang diadaptasi dari bagian II manga Naruto. Serial ini disutradarai oleh Hayato Date dan diproduksi oleh Studio Pierrot dan TV Tokyo. Pada bagian ini, pergerakan organisasi Akatsuki semakin terlihat. Naruto Shippuden juga telah dibuat versi movie-nya dengan judul Naruto Shippuden The Movie yang dirilis di Jepang pada Agustus 2007. Film ini menceritakan tentang usaha ninja jahat dalam membangkitkan Mouryou, roh jahat yang telah dikalahkan 20 tahun yang lalu. Setelah Naruto Shippuden The Movie dirilis, hadir pula Naruto Shippuden The Movie 2: Bond. Film ini menceritakan serangan kelompok ninja dari Negara Langit kepada Konoha. Kemudian Naruto Shippūden The Movie 3: Inheritors of the Will of Fire. Di sini diceritakan Konoha dituduh sebagai dalang penyebabnya para ninja dengan Kekkei Genkai menghilang dari Sunagakure, Kirigakure, Kumogakure dan Iwagakure. Di Indonesia, Naruto Shippuden sempat ditayangkan di Indosiar dan saat ini ditayangkan di GTV.");
        dummyShow.add(tvShow);

        tvShow = new TVShow();
        tvShow.setImage(R.drawable.poster_ncis);
        tvShow.setTitle("NCIS");
        tvShow.setDateStart("23 September 2003");
        tvShow.setDateEnd("On-going");
        tvShow.setEpisode("364 episodes");
        tvShow.setDescription("NCIS (Naval Criminal Investigative Service) adalah serial televisi Amerika Serikat yang di produksi oleh CBS Television Studios (Perusahaan yang sama dengan CSI: Crime Scene Investigation, CSI: Miami dan CSI: NY). Saluran aslinya adalah CBS. Meskipun NCIS tayang perdana 23 September 2003 tetapi beberapa tokohnya sudah tampil di acara CBS lainnya yaitu JAG (Judge Advocate General) dalam episode \"Icequeen\" dan \"Meltdown\" yang menampilkan tokoh-tokoh NCIS (yang saat itu merupakan Spin-off) seperti Leroy Jethro Gibbs, Anthony DiNozzo, Abby Sciuto dan Dr. Ducky Mallard. Saat ini NCIS sudah mengeluarkan Spin-off yaitu NCIS: Los Angeles (2009) dan NCIS: New Orleans (2014)");
        dummyShow.add(tvShow);

        tvShow = new TVShow();
        tvShow.setImage(R.drawable.poster_fairytail);
        tvShow.setTitle("Fairy Tail");
        tvShow.setDateStart("12 October 2009");
        tvShow.setDateEnd("On-going");
        tvShow.setEpisode("316 episodes");
        tvShow.setDescription("Fairy Tail is an anime series adapted from the manga of the same title by Hiro Mashima. Produced by A-1 Pictures and Satelight, and directed by Shinji Ishihira, it was broadcast on TV Tokyo from October 12, 2009, to March 30, 2013.[1] It later continued its run on April 5, 2014,[2] and ended on March 26, 2016.[3] A third and final series will air on October 7, 2018[4] The series follows the adventures of Natsu Dragneel, a member of the Fairy Tail wizards' guild and mage who is searching for the dragon Igneel, and partners with Lucy Heartfilia, a celestial wizard.");
        dummyShow.add(tvShow);

        tvShow = new TVShow();
        tvShow.setImage(R.drawable.poster_family_guy);
        tvShow.setTitle("Family Guy");
        tvShow.setDateStart("31 January 1999");
        tvShow.setDateEnd("On-going");
        tvShow.setEpisode("329 episodes");
        tvShow.setDescription("Family Guy is an American animated sitcom created by Seth MacFarlane for the Fox Broadcasting Company. The series centers on the Griffins, a family consisting of parents Peter and Lois; their children, Meg, Chris, and Stewie; and their anthropomorphic pet dog, Brian. The show is set in the fictional city of Quahog, Rhode Island, and exhibits much of its humor in the form of metafictional cutaway gags that often lampoon American culture.");
        dummyShow.add(tvShow);

        tvShow = new TVShow();
        tvShow.setImage(R.drawable.poster_doom_patrol);
        tvShow.setTitle("Doom Patrol");
        tvShow.setDateStart("15 Februaryy 2019");
        tvShow.setDateEnd("On-going");
        tvShow.setEpisode("15 episodes");
        tvShow.setDescription("Doom Patrol is an American web television series based on the DC Comics superhero team of the same name that premiered on February 15, 2019, on DC Universe. Despite sharing characters and actors with Titans, it is not connected to that series and occupies a completely separate continuity[1][2][3]. Filming began in Georgia in late August 2018, and the first season consists of 15 episodes.");
        dummyShow.add(tvShow);

        tvShow = new TVShow();
        tvShow.setImage(R.drawable.poster_arrow);
        tvShow.setTitle("Arrow");
        tvShow.setDateStart("10 October 2012");
        tvShow.setDateEnd("On-going");
        tvShow.setEpisode("160 episodes");
        tvShow.setDescription("Arrow is an American superhero television series developed by Greg Berlanti, Marc Guggenheim, and Andrew Kreisberg based on the DC Comics character Green Arrow, a costumed crime-fighter created by Mort Weisinger and George Papp, and is set in the Arrowverse, sharing continuity with other Arrowverse television series. The series premiered in the United States on The CW on October 10, 2012, with international broadcasting taking place in late 2012 and primarily filmed in Vancouver, British Columbia, Canada. Arrow follows billionaire playboy Oliver Queen (Stephen Amell), who claimed to have spent five years shipwrecked on Lian Yu, a mysterious island in the North China Sea, before returning home to Starling City (later renamed \"Star City\") to fight crime and corruption as a secret vigilante whose weapon of choice is a bow and arrow.");
        dummyShow.add(tvShow);

        tvShow = new TVShow();
        tvShow.setImage(R.drawable.poster_supernatural);
        tvShow.setTitle("Supernatural");
        tvShow.setDateStart("13 September 2015");
        tvShow.setDateEnd("On-going");
        tvShow.setEpisode("307 episodes");
        tvShow.setDescription("Supernatural adalah serial televisi bergenre horor. Serial ini muncul pertama kali pada tanggal 13 September 2005 di The WB, dan kini merupakan bagian dari The CW. Serial TV ini dibuat oleh Eric Kripke yang juga menjadi showrunner untuk serial ini sampai musim ke-5.");
        dummyShow.add(tvShow);

        tvShow = new TVShow();
        tvShow.setImage(R.drawable.poster_supergirl);
        tvShow.setTitle("Supergirl");
        tvShow.setDateStart("26 October 2015");
        tvShow.setDateEnd("On-going");
        tvShow.setEpisode("87 episodes");
        tvShow.setDescription("Supergirl is an American superhero television series developed by Ali Adler, Greg Berlanti and Andrew Kreisberg (the latter two having previously created Arrow and The Flash) that originally aired on CBS and premiered on October 26, 2015. It is based on the DC Comics character Supergirl, created by Otto Binder and Al Plastino, and stars Melissa Benoist in the title role. Supergirl is a costumed superheroine who is Superman's cousin and one of the last surviving Kryptonians. The series is the third series set in the Arrowverse, sharing continuity with the other television series of the franchise.");
        dummyShow.add(tvShow);

        tvShow = new TVShow();
        tvShow.setImage(R.drawable.poster_iron_fist);
        tvShow.setTitle("Iron Fist");
        tvShow.setDateStart("17 Maret 2017");
        tvShow.setDateEnd("7 September 2018");
        tvShow.setEpisode("23 episodes");
        tvShow.setDescription("Marvel's Iron Fist, or simply Iron Fist, is an American web television series created for Netflix by Scott Buck, based on the Marvel Comics character of the same name. It is set in the Marvel Cinematic Universe (MCU), sharing continuity with the films of the franchise and is the fourth in a series of shows that lead to The Defenders crossover miniseries. The series is produced by Marvel Television in association with ABC Studios, with Devilina Productions and showrunner Buck for the first season. Raven Metzner took over as showrunner for the second season.");
        dummyShow.add(tvShow);


        return dummyShow;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tv, container, false);
        // Inflate the layout for this fragment
        mRecyclerView = v.findViewById(R.id.rv_tvshow);
        RecyclerAdapter recyclerViewAdapter = new RecyclerAdapter(getContext(), listShow);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(recyclerViewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listShow = tvData();
    }
}
