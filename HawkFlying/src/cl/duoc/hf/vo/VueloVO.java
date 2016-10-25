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
"id_vuelo",
"nro_vuelo",
"condicion",
"total_tv",
"origen",
"destino",
"fecha",
"id_mision"
})
public class VueloVO {

@JsonProperty("id_vuelo")
private Integer idVuelo;
@JsonProperty("nro_vuelo")
private Integer nroVuelo;
@JsonProperty("condicion")
private String condicion;
@JsonProperty("total_tv")
private Integer totalTv;
@JsonProperty("origen")
private String origen;
@JsonProperty("destino")
private String destino;
@JsonProperty("fecha")
private String fecha;
@JsonProperty("id_mision")
private Integer idMision;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The idVuelo
*/
@JsonProperty("id_vuelo")
public Integer getIdVuelo() {
return idVuelo;
}

/**
* 
* @param idVuelo
* The id_vuelo
*/
@JsonProperty("id_vuelo")
public void setIdVuelo(Integer idVuelo) {
this.idVuelo = idVuelo;
}

/**
* 
* @return
* The nroVuelo
*/
@JsonProperty("nro_vuelo")
public Integer getNroVuelo() {
return nroVuelo;
}

/**
* 
* @param nroVuelo
* The nro_vuelo
*/
@JsonProperty("nro_vuelo")
public void setNroVuelo(Integer nroVuelo) {
this.nroVuelo = nroVuelo;
}

/**
* 
* @return
* The condicion
*/
@JsonProperty("condicion")
public String getCondicion() {
return condicion;
}

/**
* 
* @param condicion
* The condicion
*/
@JsonProperty("condicion")
public void setCondicion(String condicion) {
this.condicion = condicion;
}

/**
* 
* @return
* The totalTv
*/
@JsonProperty("total_tv")
public Integer getTotalTv() {
return totalTv;
}

/**
* 
* @param totalTv
* The total_tv
*/
@JsonProperty("total_tv")
public void setTotalTv(Integer totalTv) {
this.totalTv = totalTv;
}

/**
* 
* @return
* The origen
*/
@JsonProperty("origen")
public String getOrigen() {
return origen;
}

/**
* 
* @param origen
* The origen
*/
@JsonProperty("origen")
public void setOrigen(String origen) {
this.origen = origen;
}

/**
* 
* @return
* The destino
*/
@JsonProperty("destino")
public String getDestino() {
return destino;
}

/**
* 
* @param destino
* The destino
*/
@JsonProperty("destino")
public void setDestino(String destino) {
this.destino = destino;
}

/**
* 
* @return
* The fecha
*/
@JsonProperty("fecha")
public String getFecha() {
return fecha;
}

/**
* 
* @param fecha
* The fecha
*/
@JsonProperty("fecha")
public void setFecha(String fecha) {
this.fecha = fecha;
}

/**
* 
* @return
* The idMision
*/
@JsonProperty("id_mision")
public Integer getIdMision() {
return idMision;
}

/**
* 
* @param idMision
* The id_mision
*/
@JsonProperty("id_mision")
public void setIdMision(Integer idMision) {
this.idMision = idMision;
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