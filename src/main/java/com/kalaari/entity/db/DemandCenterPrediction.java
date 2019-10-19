package com.kalaari.entity.db;

@Table(name = "demand_center_prediction")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Where(clause = "deleted=false")
public class DemandCenterPrediction extends BaseEntity<Long> {

    @Column(name = "demand_center_id")
    private Long demandCenterId;

    @Column(name = "from_time", columnDefinition = "time")
    private Time fromTime;

    @Column(name = "to_time", columnDefinition = "time")
    private Time toTime;

    @Column(name = "idle_wait_mins")
    private Long idleWaitMins;
}