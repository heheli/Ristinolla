* Aihe: Tarkoituksena luoda ristinolla-peli. Peli on vuoropohjainen, eli se on kahdelle pelaajalle. Peliä on mahdollista pelata kolmella erilaisella laudalla, toisin sanoen käyttäjä saa valita kolmesta vaihtoehdosta ennen pelin käynnistystä.

* Käyttäjät: Kuka vain

* Käyttäjän toiminnot: Alkunäkymässä pelaajat kirjoittavat nimensä niille varattuihin kenttiin ja valitsevat yhden laudan kolmesta jolloin peli käynnistyy.

* Määrittelyvaiheen luokkakaavio:  ![luokkakaavio](RistinollaLuokkakaavioVko5.png)

* Sekvenssikaavio pelin aloittamisesta 17.2.2017 RistinollaLaudalla1:
![sekvenssikaavio] (Uusi peli laudalla 1.png)

* Sekvenssikaavio uuden pelin aloittamisesta 24.2.2017:
![sekvenssikaavio] (UusiPelinaloitus.png)

* Rakennekuvaus: Main-luokka luo Aloitus-ikkunan, johon pelaajien on tarkoitus syöttää nimensä. Nimien kirjoituksen jälkeen valitaan pelilauta kolmesta eri napista, jotka on numeroitu 1-3. Tästä painamalla peli alkaa ja Aloitus-luokka luo valitun RistinollaLaudan ja 2 pelaajaa.
RistinollaLauta käyttää Peli-luokkaa pelin tilanteen ylläpitämiseen. Peli luokan metodeita käyttämällä saadaan tarkastettua mahdolliset voitot ja aloittaa uusi peli entisen loputtua.
Peli-luokka käyttää Merkki-enumia, alussa annettuja pelaajia ja Viestit-abstraktia luokkaa mm. voiton tarkastamiseen ja pelaajille välitettäviin viesteihin. 

* Käyttöohjeet: Suorittamalla Main-luokan, aukeaa aloitusikkuna jossa pelaajat kirjoittavat nimensä niille varattuihin tekstikenttiin. Aloitusikkunassa on kolme eri numeroitua painiketta, jotka kuvaavat eri pelilautoja. Painamalla numeroitua painiketta peli alkaa.
Peli on vuoropohjainen, joka tarkoittaa sitä, että pelaajat painavat omalla vuorollaan jostakin ruudukon ruudusta, jolloin pelimerkki tulee näkyviin ruutuun. Pelaaja, joka saa vaaditun määrän omia merkkejään (X tai O) suoraan linjaan laudalla, on voittaja. Jos lauta täyttyy merkeistä niin, että kumpikaan ei saa kolmen suoraa merkeistä, tulee tasapeli. Pelin loputtua tulee näkyviin ruutu josta painamalla ok-painiketta, alkaa uusi peli. Pelin saa suljettua punaisesta ruksista ruudun ylänurkassa.
