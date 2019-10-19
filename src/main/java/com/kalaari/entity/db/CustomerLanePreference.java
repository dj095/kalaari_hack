package com.kalaari.entity.db;

@Table(name = "customer_lane_preference")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Where(clause = "deleted=false")
public class CustomerLanePreference extends BaseEntity<Long> {

    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "from_demand_center")
    private Long fromDemandCenter;

    @Column(name = "to_demand_center")
    private Long toDemandCenter;

    @Column(name = "weight")
    private Integer weight;
}