package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlacementModel {

	private int id;

	private int sid;

	private int cid;

	private String studentName;

	private String companyName;

	private String apply_date;

	private String status;
}