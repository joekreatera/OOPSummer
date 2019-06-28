class PlanetNamesCatalogue{

  static String planetNames[];

  public static String getRandomName(int minValue, int maxValue){
    int r = (int)(minValue + Math.random()*(maxValue-minValue));

    // this method reassures that even if the user developer
    // tries a max value beyond the limits, the returned
    // planet name will be inside boundaries
    return planetNames[r%planetNames.length];
  }

  public static int getLength(){
    return planetNames.length;
  }

  public static void initNames(){
      planetNames = new String[100];
      planetNames[0] = "Inzuebos";
      planetNames[1] = "Lebralara";
      planetNames[2] = "Thalyke";
      planetNames[3] = "Ucagua";
      planetNames[4] = "Uihines";
      planetNames[5] = "Kaocarro";
      planetNames[6] = "Crioliv";
      planetNames[7] = "Phathirus";
      planetNames[8] = "Beron BTG";
      planetNames[9] = "Soth LJJ7";
      planetNames[10] = "Ulmearilia";
      planetNames[11] = "Vocrerilia";
      planetNames[12] = "Hallorth";
      planetNames[13] = "Punziri";
      planetNames[14] = "Toalara";
      planetNames[15] = "Enia";
      planetNames[16] = "Zeliter";
      planetNames[17] = "Merunus";
      planetNames[18] = "Thagua HXPS";
      planetNames[19] = "Gnora J0OD";
      planetNames[20] = "Chadurus";
      planetNames[21] = "Ogomia";
      planetNames[22] = "Ochorix";
      planetNames[23] = "Sezurn";
      planetNames[24] = "Tathea";
      planetNames[25] = "Gaturn";
      planetNames[26] = "Phipobos";
      planetNames[27] = "Gracepra";
      planetNames[28] = "Lurn 8W27";
      planetNames[29] = "Giri 211I";
      planetNames[30] = "Zamowei";
      planetNames[31] = "Thenvunov";
      planetNames[32] = "Xundapus";
      planetNames[33] = "Chugreron";
      planetNames[34] = "Lenides";
      planetNames[35] = "Raruta";
      planetNames[36] = "Drugepra";
      planetNames[37] = "Straahiri";
      planetNames[38] = "Vyria H35C";
      planetNames[39] = "Gromia A8";
      planetNames[40] = "Vilnoulia";
      planetNames[41] = "Gaccepra";
      planetNames[42] = "Chanvara";
      planetNames[43] = "Xucrilles";
      planetNames[44] = "Ionerth";
      planetNames[45] = "Zeruta";
      planetNames[46] = "Bathicury";
      planetNames[47] = "Truchigantu";
      planetNames[48] = "Made 89B";
      planetNames[49] = "Streon 6B";
      planetNames[50] = "Dunniuvis";
      planetNames[51] = "Bacrealara";
      planetNames[52] = "Xothadus";
      planetNames[53] = "Xothora";
      planetNames[54] = "Yophus";
      planetNames[55] = "Vurus";
      planetNames[56] = "Llocarilia";
      planetNames[57] = "Stragutania";
      planetNames[58] = "Sippe 18R5";
      planetNames[59] = "Xotreuwei";
      planetNames[60] = "Linzulara";
      planetNames[61] = "Banvosie";
      planetNames[62] = "Bunrore";
      planetNames[63] = "Palara";
      planetNames[64] = "Rathea";
      planetNames[65] = "Vaterilia";
      planetNames[66] = "Cropahines";
      planetNames[67] = "Llara 307";
      planetNames[68] = "Ziuq U2B";
      planetNames[69] = "Asiurus";
      planetNames[70] = "Kocater";
      planetNames[71] = "Racomia";
      planetNames[72] = "Roceron";
      planetNames[73] = "Cheiria";
      planetNames[74] = "Chougantu";
      planetNames[75] = "Copaphus";
      planetNames[76] = "Sithenia";
      planetNames[77] = "Momia 1L4";
      planetNames[78] = "Strypso OZ32";
      planetNames[79] = "Hecemia";
      planetNames[80] = "Dibbualea";
      planetNames[81] = "Unneshan";
      planetNames[82] = "Recruna";
      planetNames[83] = "Daeliv";
      planetNames[84] = "Aiwei";
      planetNames[85] = "Dolinus";
      planetNames[86] = "Trekowei";
      planetNames[87] = "Cyke 83FT";
      planetNames[88] = "Gryke 8U";
      planetNames[89] = "Gonvoanus";
      planetNames[90] = "Xuliuter";
      planetNames[91] = "Almoth";
      planetNames[92] = "Onroria";
      planetNames[93] = "Xitune";
      planetNames[94] = "Thetis";
      planetNames[95] = "Gecalara";
      planetNames[96] = "Drapinia";
      planetNames[97] = "Strion A50";
      planetNames[98] = "Llarvis GG9E";
      planetNames[99] = "Yalliaphus";
  }


}