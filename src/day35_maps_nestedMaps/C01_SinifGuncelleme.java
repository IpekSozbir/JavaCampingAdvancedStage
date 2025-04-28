package day35_maps_nestedMaps;

import day34_maps.MapDepo;

public class C01_SinifGuncelleme extends MapDepo {

    public static void main(String[] args) {

        // yil sonu sinif artirma yapin
        // her ogrenciyi bir ust sinifa gecirin
        // sinif 12 ise mezun yapin, zaten mezunsa degisiklik yapmayin

        System.out.println(ogrenciMap);

       MapDepo.yilsonuSinifArtir();
        System.out.println(ogrenciMap);

    }
}
