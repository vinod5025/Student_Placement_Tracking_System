package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddCompanyModel {

	private int id;

	private String company_name;

	private String location;

	private int company_package;

	private double company_criteria;
}