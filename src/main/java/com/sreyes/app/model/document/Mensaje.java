package com.sreyes.app.model.document;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mensaje implements Serializable{

    private String texto;
    private Long fecha;
    /**
	 * 
	 */
    private static final long serialVersionUID = 1L;
}
