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
public class MoviesFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private ArrayList<Movie> listMovie;


    public MoviesFragment() {
        // Required empty public constructor
    }

    private static ArrayList<Movie> filmData() {
        ArrayList<Movie> dummyFilms = new ArrayList<>();
        Movie film = new Movie();
        film.setImage(R.drawable.poster_a_start_is_born);
        film.setTitle("A Star Is Born");
        film.setDate("31 Agustus 2018");
        film.setDescription("A Star Is Born adalah film drama musikal romantis Amerika Serikat tahun 2018 yang disutradarai oleh Bradley Cooper dan diproduseri oleh Bradley Cooper, Todd Phillips, Bill Gerber, Jon Peters dan Lynette Howell Taylor. Naskah film ini ditulis oleh Eric Roth, Bradley Cooper dan Will Fetters berdasarkan film A Star Is Born tahun 1937 karya William A. Wellman, Robert Carson, Dorothy Parker dan Alan Campbell. Film ini dibintangi oleh Bradley Cooper, Lady Gaga, Andrew Dice Clay, Dave Chappelle dan Sam Elliott.\n" +
                "\n" +
                "Film A Star Is Born ditayangkan secara perdana di Festival Film Venesia pada tanggal 31 Agustus 2018[4][5] dan dirilis di Amerika Serikat pada tanggal 5 Oktober 2018.[6] Film ini mendapatkan review positif dari para kritikus.");
        dummyFilms.add(film);

        film = new Movie();
        film.setImage(R.drawable.poster_alita);
        film.setTitle("Alita: Battle Angel");
        film.setDate("14 Februari 2019");
        film.setDescription("Alita: Battle Angel adalah sebuah film aksi cyberpunk Amerika Serikat tahun 2019 berdasarkan pada seri manga karya Yukito Kishiro, Gunnm atau Battle Angel Alita. Diproduksi oleh James Cameron dan Jon Landau, film tersebut disutradarai oleh Robert Rodriguez dari sebuah skenario karya Cameron, Rodriguez dan Laeta Kalogridis. Rosa Salazar sebagai Alita, seorang cyborg (robot manusia), dengan pemeran pendukung seperti Christoph Waltz, Jennifer Connelly, Mahershala Ali, Ed Skrein, Jackie Earle Haley dan Keean Johnson.");
        dummyFilms.add(film);

        film = new Movie();
        film.setImage(R.drawable.poster_aquaman);
        film.setTitle("Aquaman");
        film.setDate("21 Desember 2018");
        film.setDescription("Aquaman adalah film pahlawan super Amerika tahun 2018 yang didasarkan pada karakter DC Comics, Aquaman, dan didistribusikan oleh Warner Bros. Pictures. Ini adalah angsuran keenam di DC Extended Universe (DCEU). Film ini disutradarai oleh James Wan, dengan skenario oleh David Leslie Johnson-McGoldrick dan Will Beall, dan didasarkan pada sebuah cerita dari Geoff Johns, Wan dan Beall. Ini dibintangi Jason Momoa sebagai karakter judul, dengan Amber Heard, Willem Dafoe, Patrick Wilson, Dolph Lundgren, Yahya Abdul-Mateen II, dan Nicole Kidman dalam peran pendukung. Ini adalah film teater laga hidup ketiga yang menampilkan Aquaman, mengikuti Batman v Superman: Dawn of Justice (2016) dan Justice League (2017), dan film pertama yang berpusat di sekitar karakter. Di Aquaman, karakter tituler mengetahui bahwa ia adalah pewaris kerajaan bawah laut Atlantis dan harus melangkah maju untuk memimpin rakyatnya melawan saudara tirinya, Orm, yang berupaya menyatukan tujuh kerajaan bawah laut melawan dunia permukaan.");
        dummyFilms.add(film);

        film = new Movie();
        film.setImage(R.drawable.poster_cold_persuit);
        film.setTitle("Cold Pursuit");
        film.setDate("8 February 2019");
        film.setDescription("Cold Pursuit is a 2019 black comedy action film[1][5] directed by Hans Petter Moland (in his Hollywood debut) from a screenplay by Frank Baldwin. The film stars Liam Neeson, Tom Bateman, Tom Jackson, Emmy Rossum, Domenick Lombardozzi, Julia Jones, John Doman, and Laura Dern. It is an official remake of the 2014 Norwegian film In Order of Disappearance (Kraftidioten), also directed by Moland, and follows a vengeful snowplow driver who starts killing the members of a drug cartel following the murder of his son.");
        dummyFilms.add(film);

        film = new Movie();
        film.setImage(R.drawable.poster_bohemian);
        film.setTitle("Bohemian Rhapsody");
        film.setDate("27 Oktober 2018");
        film.setDescription("Bohemian Rhapsody adalah sebuah film biografi tahun 2018 tentang grup band rock Inggris, Queen. Film ini menceritakan tentang kehidupan penyanyi Freddie Mercury, yang berujung pada penampilan Queen pada konser Live Aid di Stadion Wembley pada tahun 1985. Bohemian Rhapsody disutradarai oleh Bryan Singer, skenario film ini ditulis oleh Anthony McCarten dan diproduseri oleh Graham King dan mantan manajer Queen Jim Beach. Film ini dibintangi oleh Rami Malek sebagai Mercury, dan didukung oleh para pemeran di antaranya seperti Lucy Boynton, Gwilym Lee, Ben Hardy, Joe Mazzello, Aidan Gillen, Allen Leech, Tom Hollander dan Mike Myers. Anggota grup band Queen, Brian May dan Roger Taylor bertindak sebagai konsultan kreatif dan musik pada film ini. Film ini diproduksi secara patungan oleh perusahaan Inggris dan Amerika di antaranya 20th Century Fox, New Regency, GK Films, dan Queen Films, dengan Fox juga bertindak sebagai sebagai distributornya.");
        dummyFilms.add(film);

        film = new Movie();
        film.setImage(R.drawable.poster_robin_hood);
        film.setTitle("Robin Hood (2018)");
        film.setDate("21 November 2018");
        film.setDescription("Robin Hood is a 2018 American action-adventure film directed by Otto Bathurst and written by Ben Chandler and David James Kelly, from a story by Chandler. It is a telling of the Robin Hood legend, and follows his training by John to steal from the Sheriff of Nottingham. The film stars Taron Egerton, Jamie Foxx, Ben Mendelsohn, Eve Hewson, Tim Minchin, and Jamie Dornan.");
        dummyFilms.add(film);

        film = new Movie();
        film.setImage(R.drawable.poster_spiderman);
        film.setTitle("Spider-Man: Into the Spider-Verse");
        film.setDate("14 Desember 2018");
        film.setDescription("Spider-Man: Into the Spider-Verse adalah film pahlawan super animasi komputer Amerika Serikat tahun 2018 yang diangkat dari tokoh Marvel Comics, Miles Morales / Spider-Man. Film ini diproduksi oleh Columbia Pictures dan Sony Pictures Animation bekerja sama dengan Marvel dan didistribusikan oleh Sony Pictures Releasing. Ini adalah film cerita animasi pertama dalam seri Spider-Man.[4][5] Film ini mengambil latar di multisemesta bersama bernama \"Spider-Verse\" yang memiliki banyak semesta alternatif.[a] Film ini disutradarai oleh Bob Persichetti, Peter Ramsey, dan Rodney Rothman. Naskahnya ditulis oleh Phil Lord dan Rothman. Film ini dibintangi Shameik Moore yang memerankan Morales, Jake Johnson, Hailee Steinfeld, Mahershala Ali, Brian Tyree Henry, Lily Tomlin, Luna Lauren Velez, John Mulaney, Kimiko Glenn, Nicolas Cage, dan Liev Schreiber. Di Spider-Man: Into the Spider-Verse, Miles Morales adalah satu dari beberapa Spider-Man yang bersatu untuk menyelamatkan New York City dari Kingpin.");
        dummyFilms.add(film);

        film = new Movie();
        film.setImage(R.drawable.poster_ralph);
        film.setTitle("Ralph Breaks the Internet");
        film.setDate("21 November 2018");
        film.setDescription("Ralph Breaks the Internet is a 2018 American 3D computer-animated comedy film produced by Walt Disney Animation Studios and distributed by Walt Disney Pictures. It is the sequel to the 2012 film Wreck-It Ralph, making it Disney's 57th feature-length animated film. The film was directed by Rich Moore and Phil Johnston (who wrote the screenplay with Pamela Ribon) and executive-produced by John Lasseter, Chris Williams and Jennifer Lee.[a] It features voice work by John C. Reilly, Sarah Silverman, Jack McBrayer, Jane Lynch and Ed O'Neill (reprising their roles from the first film), with Alan Tudyk returning to voice a new character and new additions to the cast that include Gal Gadot, Taraji P. Henson and Alfred Molina.");
        dummyFilms.add(film);

        film = new Movie();
        film.setImage(R.drawable.poster_mortal_engines);
        film.setTitle("Mortal Engines");
        film.setDate("14 December 2018");
        film.setDescription("Mortal Engines is a 2018 post-apocalyptic adventure film directed by Christian Rivers and with a screenplay by Fran Walsh, Philippa Boyens, and Peter Jackson, based on the novel of the same name by Philip Reeve, and starring Hera Hilmar, Robert Sheehan, Hugo Weaving, Jihae, Ronan Raftery, Leila George, Patrick Malahide, and Stephen Lang. An American–New Zealand co-production, the film is set in a post-apocalyptic world where entire cities have been mounted on wheels and motorised, and prey on one another.");
        dummyFilms.add(film);

        film = new Movie();
        film.setImage(R.drawable.poster_crimes);
        film.setTitle("Fantastic Beasts: The Crimes of Grindelwald");
        film.setDate("16 November 2018");
        film.setDescription("Fantastic Beasts: The Crimes of Grindelwald is a 2018 fantasy film directed by David Yates and written by J. K. Rowling. A joint British and American production, it is the sequel to Fantastic Beasts and Where to Find Them (2016). It is the second instalment in the Fantastic Beasts film series, and the tenth overall in the Wizarding World franchise, which began with the Harry Potter film series. The film features an ensemble cast that includes Eddie Redmayne, Katherine Waterston, Dan Fogler, Alison Sudol, Ezra Miller, Zoë Kravitz, Callum Turner, Claudia Kim, William Nadylam, Kevin Guthrie, Jude Law, and Johnny Depp. The plot follows Newt Scamander and Albus Dumbledore as they attempt to take down the dark wizard Gellert Grindelwald, while facing new threats in a more divided wizarding world.");
        dummyFilms.add(film);

        film = new Movie();
        film.setImage(R.drawable.poster_creed);
        film.setTitle("Creed II");
        film.setDate("21 November 2018");
        film.setDescription("Creed II is a 2018 American sports drama film directed by Steven Caple Jr., and written by Sylvester Stallone and Juel Taylor from a story by Sascha Penn and Cheo Hodari Coker. A sequel to Creed (2015) and the eighth installment in the Rocky film series, it stars Michael B. Jordan, Stallone, Tessa Thompson, Dolph Lundgren, Florian Munteanu, Wood Harris, and Phylicia Rashad. Creed writer-director Ryan Coogler serves as an executive producer on the film. The film follows a fight over 33 years in the making, as Adonis Creed meets a new adversary in the ring: Viktor Drago, son of Ivan Drago, the powerful athlete who killed Adonis' father Apollo Creed.");
        dummyFilms.add(film);

        return dummyFilms;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_movies, container, false);
        mRecyclerView = v.findViewById(R.id.rv_movies);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), listMovie);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(recyclerViewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listMovie = filmData();
    }


}
