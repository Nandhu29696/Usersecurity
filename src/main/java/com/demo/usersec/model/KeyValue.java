package com.demo.usersec.model;

import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.demo.usersec.config.HashMapConverter;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "KeyValue")
public class KeyValue {

	@Id
	@Column(name = "key", nullable = false)
	private String key;

	@Convert(converter = HashMapConverter.class)
	@Column(name = "value", nullable = false)
	private Map<String, Object> value;

}
