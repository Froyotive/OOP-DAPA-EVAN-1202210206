public class Perangkat {
    protected String drive;
    protected int ram;
    protected float processor;



    public String getDrive(){
        return this.drive;
    }

    public int getRam(){
        return this.ram;
    }

    public void setProcessor(float processor){
        this.processor = processor;
    }

    public float getProcessor(){
        return this.processor;
    }

    public Perangkat(String drive, int ram, float processor){
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }

    public void informasi(){
        System.out.println("Perangkat tidak diketahui memiliki drive tipe " + getDrive() + " dengan ram sebesar " + getRam() + " GB dan processor secepat " + getProcessor() + " Ghz");
    }
}
