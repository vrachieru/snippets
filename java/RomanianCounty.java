public enum RomanianCounty {
    AB("Alba"),
    AG("Arges"),
    AR("Arad"),
    B("Bucuresti"),
    BC("Bacau"),
    BH("Bihor"),
    BN("Bistrita-Nasaud"),
    BR("Braila"),
    BT("Botosani"),
    BV("Brasov"),
    BZ("Buzau"),
    CJ("Cluj"),
    CL("Calarasi"),
    CS("Caras-Severin"),
    CT("Constanta"),
    CV("Covasna"),
    DB("Dambovita"),
    DJ("Dolj"),
    GJ("Gorj"),
    GL("Galati"),
    GR("Giurgiu"),
    HD("Hunedoara"),
    HR("Harghita"),
    IF("Ilfov"),
    IL("Ialomita"),
    IS("Iasi"),
    MH("Mehedinti"),
    MM("Maramures"),
    MS("Mures"),
    NT("Neamt"),
    OT("Olt"),
    PH("Prahova"),
    SB("Sibiu"),
    SJ("Salaj"),
    SM("Satu Mare"),
    SV("Suceava"),
    TL("Tulcea"),
    TM("Timis"),
    TR("Teleorman"),
    VL("Valcea"),
    VN("Vrancea"),
    VS("Vaslui");

    private String name;

    RomanianCounty(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
