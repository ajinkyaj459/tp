package com.ca.sportmvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="match_data")
public class Matches {
	
  @Id
  //@Size(min=4,max=4,message="Enter W or L")
  @Column(name="match_id")
  public int matchId;
  
  @Column(name="leftPlayerId")
  public int leftPlayerId;
  
  @Column(name="rightPlayerId")
  public int rightPlayerId;
  
  @Column(name="leftfirstSet")
  public int leftFirstSet;
   @Column(name="rightfirstSet")
  public int rightFirstSet;
   
  @Column(name="leftsecondSet")
  public int leftSecondSet;
  @Column(name="rightsecondSet")
  public int rightSecondSet;
  
  @Column(name="leftthirdSet")
  public int leftThirdSet;
  @Column(name="rightthirdSet")
  public int rightThirdSet;
  
  //@Size(min=1,max=1,message="Enter W or L")
  @Column(name="matchResult")
  public int result;

public int getMatchId() {
	return matchId;
}

public void setMatchId(int matchId) {
	this.matchId = matchId;
}

public int getLeftPlayerId() {
	return leftPlayerId;
}

public void setLeftPlayerId(int leftPlayerId) {
	this.leftPlayerId = leftPlayerId;
}

public int getRightPlayerId() {
	return rightPlayerId;
}

public void setRightPlayerId(int rightPlayerId) {
	this.rightPlayerId = rightPlayerId;
}

public int getLeftFirstSet() {
	return leftFirstSet;
}

public void setLeftFirstSet(int leftFirstSet) {
	this.leftFirstSet = leftFirstSet;
}

public int getRightFirstSet() {
	return rightFirstSet;
}

public void setRightFirstSet(int rightFirstSet) {
	this.rightFirstSet = rightFirstSet;
}

public int getLeftSecondSet() {
	return leftSecondSet;
}

public void setLeftSecondSet(int leftSecondSet) {
	this.leftSecondSet = leftSecondSet;
}

public int getRightSecondSet() {
	return rightSecondSet;
}

public void setRightSecondSet(int rightSecondSet) {
	this.rightSecondSet = rightSecondSet;
}

public int getLeftThirdSet() {
	return leftThirdSet;
}

public void setLeftThirdSet(int leftThirdSet) {
	this.leftThirdSet = leftThirdSet;
}

public int getRightThirdSet() {
	return rightThirdSet;
}

public void setRightThirdSet(int rightThirdSet) {
	this.rightThirdSet = rightThirdSet;
}

public int getResult() {
	return result;
}

public void setResult(int result) {
	this.result = result;
}

  
}
