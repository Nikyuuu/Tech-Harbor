package tech.techharbor.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Entity
@Data
@Table(name = "manufacturer", schema = "project", catalog = "db_202324z_va_prj_techharbor")
public class ManufacturerModel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "manufacturer_id", nullable = false)
    private Integer manufacturerId;
    @Basic
    @Column(name = "manufacturer_name", length = 100)
    private String manufacturerName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ManufacturerModel that = (ManufacturerModel) o;
        return Objects.equals(manufacturerId, that.manufacturerId) && Objects.equals(manufacturerName, that.manufacturerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturerId, manufacturerName);
    }
}
