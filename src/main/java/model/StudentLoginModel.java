package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentLoginModel {

	private int sid;

	private String email;

	private String password;
}