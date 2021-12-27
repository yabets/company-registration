package com.yb.customer_registration.domain;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Table(name = "company")
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Company {
    @Id @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private Size size;

    public Company(String name, Size size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Company company = (Company) o;
        return id != null && Objects.equals(id, company.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
