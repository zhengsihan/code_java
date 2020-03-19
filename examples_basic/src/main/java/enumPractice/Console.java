package enumPractice;

public enum Console {
    PLAYSTATION("sony", 399),
    XBOX("microsoft", 299),
    SWITCH("nintendo", 199);

    private final String company;
    private final Integer price;

    Console(String company, Integer price) {
        this.company = company;
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public Integer getPrice() {
        return price;
    }

    public static Integer getPriceByCompany(String company) {
        for( Console enums : Console.values()) {
            if(enums.getCompany().equals(company)){
                return enums.getPrice();
            }
        }
        return null;
    }
}
