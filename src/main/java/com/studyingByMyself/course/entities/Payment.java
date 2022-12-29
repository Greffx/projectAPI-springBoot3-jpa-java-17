package com.studyingByMyself.course.entities;

import jakarta.persistence.*;
import org.aspectj.weaver.ast.Or;

import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Instant moment;

    @OneToOne
    @MapsId
    private Order order;

    public Payment() {
    }

    public Payment(Integer id, Instant moment, Order order) {
        this.order = order;
        this.id = id;
        this.moment = moment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return getId().equals(payment.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
