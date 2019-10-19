package com.kalaari.entity.db;

@Table(name = "demand_center")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Where(clause = "deleted=false")
public class DemandCenter extends BaseEntity<Long> {

    @Column(name = "name")
    private String name;

    @Column(name = "lat")
    private Double lat;

    @Column(name = "lng")
    private Double lng;
}