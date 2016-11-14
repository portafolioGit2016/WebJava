package cl.duoc.hf.vo;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"id_aerodromo",
"nombre",
"ciudad"
})
public class AerodromoVO {

@JsonProperty("id_aerodromo")
private Integer idAerodromo;
@JsonProperty("nombre")
private String nombre;
@JsonProperty("ciudad")
private String ciudad;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The idAerodromo
*/
@JsonProperty("id_aerodromo")
public Integer getIdAerodromo() {
return idAerodromo;
}

/**
* 
* @param idAerodromo
* The id_aerodromo
*/
@JsonProperty("id_aerodromo")
public void setIdAerodromo(Integer idAerodromo) {
this.idAerodromo = idAerodromo;
}

/**
* 
* @return
* The nombre
*/
@JsonProperty("nombre")
public String getNombre() {
return nombre;
}

/**
* 
* @param nombre
* The nombre
*/
@JsonProperty("nombre")
public void setNombre(String nombre) {
this.nombre = nombre;
}

/**
* 
* @return
* The ciudad
*/
@JsonProperty("ciudad")
public String getCiudad() {
return ciudad;
}

/**
* 
* @param ciudad
* The ciudad
*/
@JsonProperty("ciudad")
public void setCiudad(String ciudad) {
this.ciudad = ciudad;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}
