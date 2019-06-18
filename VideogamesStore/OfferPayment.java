public class OfferPayment extends Payment{

    private Offer offer;

    public OfferPayment(Videogame vg, String d, float a, Offer o){
      super(vg, d, a);
      offer = o;
    }

    public Offer getOffer(){
      return offer;
    }

    @Override
    public String toString(){
        return date + " " + videogame + " " + amount + " " + offer;
    }

}
