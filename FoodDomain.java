    package com.example.intent;

    import java.io.Serializable;

    public class FoodDomain implements Serializable {

    private String title;
    private String pic;
    private String description;
    private double fee;
    private int numberInCards;

        public FoodDomain(String title, String pic, double fee ) {
            this.title = title;
            this.pic = pic;
            this.description = description;
            this.fee = fee ;


        }

        public FoodDomain(String title , String pic , String discription ,double fee ,int numberInCards) {
            this.title = title;
            this.pic = pic;
            this.description = discription;
            this.fee = fee ;
            this.numberInCards = numberInCards;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getPic() {
            return pic;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public double getFee() {
            return fee;
        }

        public void setFee(double fee) {
            this.fee = fee;
        }

        public int getNumberInCards() {
            return numberInCards;
        }

        public void setNumberInCards(int numberInCards) {
            this.numberInCards = numberInCards;
        }

    }
