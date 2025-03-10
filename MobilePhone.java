class MobilePhone {
    String brand;
    String model;
    int price;

    MobilePhone(String b, String m, int p){
        this.brand = b;
        this.model = m;
        this.price = p;
    }

    void displayDetails() {
        System.err.print("The details of the MobilePhone : ");
        System.out.print(this.brand + " ");
        System.out.print(this.model + " ");
        System.out.println(this.price);
    }

    public static void main(String[] args) {
        MobilePhone m1 = new MobilePhone("Apple","15 Pro" , 1500);
        m1.displayDetails();
        
        MobilePhone m2 = new MobilePhone("Sumsung","Galaxy" , 1200);
        m2.displayDetails();

    }
}

// The details of the MobilePhone : Apple 15 Pro 1500
// The details of the MobilePhone : Sumsung Galaxy 1200