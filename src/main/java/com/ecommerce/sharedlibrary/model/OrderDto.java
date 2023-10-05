package com.ecommerce.sharedlibrary.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(description = "Class representing a order in e-commerce application.")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {

	@ApiModelProperty(notes = "Unique identifier of the Order.", example = "1")
    private Long id;

	@ApiModelProperty(notes = "Order Date.", example = "2023-10-05")
    @NotNull
    private LocalDate orderedDate;

	@ApiModelProperty(notes = "Status of the Order.", example = "DELIVERED")
    private OrderStatus status;

	@ApiModelProperty(notes = "Total amount of the order.", example = "450.00")
    @NotNull
    private BigDecimal total;

	@ApiModelProperty(notes = "Items in the order.")
	@NotEmpty
    private List<ItemDto> items;

	@ApiModelProperty(notes = "Unique identifier of the Customer.", example = "1")
    @NotNull
    private Long userId;
}
