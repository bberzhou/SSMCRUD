package blackberry.curd.bean;

public class Department {

    private Integer deptId;


    private String deptName;

    public Integer getDeptId () {
        return deptId;
    }

    public void setDeptId (Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName () {
        return deptName;
    }

    public void setDeptName (String deptName) {
        this.deptName = deptName == null ? null : deptName.trim ();
    }

    //  重写toString方法
    @Override
    public String toString () {
        return "Department{" +
            "deptId=" + deptId +
            ", deptName='" + deptName + '\'' +
            '}';
    }
    //  无参构造器
    public Department () {
    }

    //  有参数的构造器
    public Department (Integer deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }
}