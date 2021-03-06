/**
 * customer vo
 * @author greatjin
 */
package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	private Integer id;
	private String firstName;
	private String lastName;
}
