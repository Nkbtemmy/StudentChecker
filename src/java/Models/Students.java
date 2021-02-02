package Models;


public class Students {
    private String name,school,faculity,photo;
    private int level,reg_number;
   public Students(){
       super();
   }
   public Students(String name, String school, String faculity, int level,int reg_number, String photo){
       super();
       this.name = name;
       this.school = school;
       this.faculity = faculity;
       this.level = level;
       this.reg_number = reg_number;
       this.photo = photo;
   }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the school
     */
    public String getSchool() {
        return school;
    }

    /**
     * @param school the school to set
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * @return the faculity
     */
    public String getFaculity() {
        return faculity;
    }

    /**
     * @param faculity the faculity to set
     */
    public void setFaculity(String faculity) {
        this.faculity = faculity;
    }

    /**
     * @return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * @return the reg_number
     */
    public int getReg_number() {
        return reg_number;
    }

    /**
     * @param reg_number the reg_number to set
     */
    public void setReg_number(int reg_number) {
        this.reg_number = reg_number;
    }

    /**
     * @return the photo
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * @param photo the photo to set
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }
    
}
