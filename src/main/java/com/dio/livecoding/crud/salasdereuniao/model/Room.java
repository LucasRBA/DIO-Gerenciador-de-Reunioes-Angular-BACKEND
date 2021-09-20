package com.dio.livecoding.crud.salasdereuniao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "meetingroom")
public class Room {

  private long id;
  private String name;
  private String date;
  private String startHour;
  private String endHour;
  private String participantsNo;
  private String reunionSub;

  public Room(){

  }

  public Room(long id, String name, String date, String startHour, String endHour, String participantsNo, String reunionSub) {
    this.id = id;
    this.name = name;
    this.date = date;
    this.startHour = startHour;
    this.endHour = endHour;
    this.participantsNo = participantsNo;
    this.reunionSub = reunionSub;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  @Column(name = "name", nullable = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Column(name = "date", nullable = false)
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  @Column(name = "startHour", nullable = false)
  public String getStartHour() {
    return startHour;
  }

  public void setStartHour(String startHour) {
    this.startHour = startHour;
  }

  @Column(name = "endHour", nullable = false)
  public String getEndHour() {
    return endHour;
  }

  public void setEndHour(String endHour) {
    this.endHour = endHour;
  }

  @Column(name = "participantsNo")
  public String getParticipantsNumber() {return participantsNo;}

  public void setParticipantsNumber(String participantsNo) {this.participantsNo = participantsNo;}

  @Column(name = "reunionSub", nullable = false)
  public String getReunionSubject() {
    return reunionSub;
  }

  public void setReunionSubject (String reunionSub) {this.reunionSub = reunionSub;}




  @Override
  public String toString() {
    return "Room [id=" + id + ", name=" + name + ", startHour=" + startHour + ", endHour=" + endHour + ", participantsNo=" + participantsNo +
            ", reunionSub=" + reunionSub + "]";
  }


}
