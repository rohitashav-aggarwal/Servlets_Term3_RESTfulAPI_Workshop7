package Entities;

import javax.persistence.*;

@Entity
@Table(name = "classes", schema = "travelexperts", catalog = "")
public class ClassesEntity {

    @Id
    @Column(name = "ClassId", nullable = false, length = 5)
    private String classId;

    @Basic
    @Column(name = "ClassName", nullable = false, length = 20)
    private String className;

    @Basic
    @Column(name = "ClassDesc", nullable = true, length = 50)
    private String classDesc;


    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }


    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }


    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        ClassesEntity that = (ClassesEntity) o;
//
//        if (classId != null ? !classId.equals(that.classId) : that.classId != null) return false;
//        if (className != null ? !className.equals(that.className) : that.className != null) return false;
//        if (classDesc != null ? !classDesc.equals(that.classDesc) : that.classDesc != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = classId != null ? classId.hashCode() : 0;
//        result = 31 * result + (className != null ? className.hashCode() : 0);
//        result = 31 * result + (classDesc != null ? classDesc.hashCode() : 0);
//        return result;
//    }
}
