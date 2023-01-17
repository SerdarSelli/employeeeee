public class employe {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public employe(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        if (this.salary<1000){
            return this.salary;
        }else {
            double tax = this.salary*0.03;
            return tax;
        }
    }
    double bonus(){
        int bonus = this.workHours-40;
        int bonuss;
        if ((bonus)<0){
            return this.workHours;
        }else {
            bonuss=bonus*30;
            return bonuss;
        }
    }

    double raiseSalary(){
        int workYears = 2021-this.hireYear;
        double maasArtisi = 0;
        if (workYears<10){
        return maasArtisi = this.salary * 0.05;
        } else if ( workYears >= 10 && workYears < 19) {
            return maasArtisi = this.salary * 0.1;
        }else {
            return maasArtisi = this.salary * 0.15;
        }
    }

    public String toString(){
        return "Maaş : "+ this.salary+"\n"+"Çalışma saati : "+this.workHours+"\n"
                +"Başlangıç yılı : "+this.hireYear+"\n"+"Vergi : "+ tax()+"\n"+
                "Bonus : "+bonus()+"\n"+"Maaş artışı : "+raiseSalary()+"\n"+"Vergi ve bonusla birlikte Maaş: "+
                (this.salary+(bonus()-tax()))+"\n"+"Toplam Maaş : "+(this.salary+(raiseSalary()));

}
}
