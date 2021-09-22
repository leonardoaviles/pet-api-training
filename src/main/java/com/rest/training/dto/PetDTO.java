package com.rest.training.dto;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rest.training.controllers.exception.EnumValidator;

public class PetDTO {

	private Integer id;
	@NotEmpty(message = "id should not be empty")
	private String name;
	@NotEmpty(message = "Name should not be empty")
	@EnumValidator(acceptedValues = {"AVAILABLE","PENDING","SOLD"})
	private String status;
	@NotNull(message = "Category should be provided")
	@Valid
	private CategoryDTO category;
	@NotEmpty(message = "Provide at least one Tag")
	private List<TagDTO> tags;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public CategoryDTO getCategory() {
		return category;
	}
	public void setCategory(CategoryDTO category) {
		this.category = category;
	}
	public List<TagDTO> getTags() {
		return tags;
	}
	public void setTags(List<TagDTO> tags) {
		this.tags = tags;
	}
	
	
}
