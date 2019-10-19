package com.kalaari.entity.db;

@Table(name = "customer")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Where(clause = "deleted=false")
public class Customer extends BaseEntity<Long> {

    @Column(name = "name")
    private String name;

    @Column(name = "rating")
    private Double rating;

    @Column(name = "no_of_rides")
    private Integer noOfRides;
}