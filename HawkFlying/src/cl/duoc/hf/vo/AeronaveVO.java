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
"id_aeronave",
"tipo",
"cantidad_horas",
"fecha_inspeccion",
"ano_fabricacion",
"fecha_dgac",
"tipo_modelo",
"capacidad",
"hr_autonomia",
"marca",
"estado",
"fecha_de_vencimiento"
})
public class AeronaveVO {

@JsonProperty("id_aeronave")
private Integer idAeronave;
@JsonProperty("tipo")
private String tipo;
@JsonProperty("cantidad_horas")
private Integer cantidadHoras;
@JsonProperty("fecha_inspeccion")
private String fechaInspeccion;
@JsonProperty("ano_fabricacion")
private Integer anoFabricacion;
@JsonProperty("fecha_dgac")
private String fechaDgac;
@JsonProperty("tipo_modelo")
private String tipoModelo;
@JsonProperty("capacidad")
private Integer capacidad;
@JsonProperty("hr_autonomia")
private Integer hrAutonomia;
@JsonProperty("marca")
private String marca;
@JsonProperty("estado")
private String estado;
@JsonProperty("fecha_de_vencimiento")
private String fechaDeVencimiento;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The idAeronave
*/
@JsonProperty("id_aeronave")
public Integer getIdAeronave() {
return idAeronave;
}

/**
* 
* @param idAeronave
* The id_aeronave
*/
@JsonProperty("id_aeronave")
public void setIdAeronave(Integer idAeronave) {
this.idAeronave = idAeronave;
}

/**
* 
* @return
* The tipo
*/
@JsonProperty("tipo")
public String getTipo() {
return tipo;
}

/**
* 
* @param tipo
* The tipo
*/
@JsonProperty("tipo")
public void setTipo(String tipo) {
this.tipo = tipo;
}

/**
* 
* @return
* The cantidadHoras
*/
@JsonProperty("cantidad_horas")
public Integer getCantidadHoras() {
return cantidadHoras;
}

/**
* 
* @param cantidadHoras
* The cantidad_horas
*/
@JsonProperty("cantidad_horas")
public void setCantidadHoras(Integer cantidadHoras) {
this.cantidadHoras = cantidadHoras;
}

/**
* 
* @return
* The fechaInspeccion
*/
@JsonProperty("fecha_inspeccion")
public String getFechaInspeccion() {
return fechaInspeccion;
}

/**
* 
* @param fechaInspeccion
* The fecha_inspeccion
*/
@JsonProperty("fecha_inspeccion")
public void setFechaInspeccion(String fechaInspeccion) {
this.fechaInspeccion = fechaInspeccion;
}

/**
* 
* @return
* The anoFabricacion
*/
@JsonProperty("ano_fabricacion")
public Integer getAnoFabricacion() {
return anoFabricacion;
}

/**
* 
* @param anoFabricacion
* The ano_fabricacion
*/
@JsonProperty("ano_fabricacion")
public void setAnoFabricacion(Integer anoFabricacion) {
this.anoFabricacion = anoFabricacion;
}

/**
* 
* @return
* The fechaDgac
*/
@JsonProperty("fecha_dgac")
public String getFechaDgac() {
return fechaDgac;
}

/**
* 
* @param fechaDgac
* The fecha_dgac
*/
@JsonProperty("fecha_dgac")
public void setFechaDgac(String fechaDgac) {
this.fechaDgac = fechaDgac;
}

/**
* 
* @return
* The tipoModelo
*/
@JsonProperty("tipo_modelo")
public String getTipoModelo() {
return tipoModelo;
}

/**
* 
* @param tipoModelo
* The tipo_modelo
*/
@JsonProperty("tipo_modelo")
public void setTipoModelo(String tipoModelo) {
this.tipoModelo = tipoModelo;
}

/**
* 
* @return
* The capacidad
*/
@JsonProperty("capacidad")
public Integer getCapacidad() {
return capacidad;
}

/**
* 
* @param capacidad
* The capacidad
*/
@JsonProperty("capacidad")
public void setCapacidad(Integer capacidad) {
this.capacidad = capacidad;
}

/**
* 
* @return
* The hrAutonomia
*/
@JsonProperty("hr_autonomia")
public Integer getHrAutonomia() {
return hrAutonomia;
}

/**
* 
* @param hrAutonomia
* The hr_autonomia
*/
@JsonProperty("hr_autonomia")
public void setHrAutonomia(Integer hrAutonomia) {
this.hrAutonomia = hrAutonomia;
}

/**
* 
* @return
* The marca
*/
@JsonProperty("marca")
public String getMarca() {
return marca;
}

/**
* 
* @param marca
* The marca
*/
@JsonProperty("marca")
public void setMarca(String marca) {
this.marca = marca;
}

/**
* 
* @return
* The estado
*/
@JsonProperty("estado")
public String getEstado() {
return estado;
}

/**
* 
* @param estado
* The estado
*/
@JsonProperty("estado")
public void setEstado(String estado) {
this.estado = estado;
}

/**
* 
* @return
* The fechaDeVencimiento
*/
@JsonProperty("fecha_de_vencimiento")
public String getFechaDeVencimiento() {
return fechaDeVencimiento;
}

/**
* 
* @param fechaDeVencimiento
* The fecha_de_vencimiento
*/
@JsonProperty("fecha_de_vencimiento")
public void setFechaDeVencimiento(String fechaDeVencimiento) {
this.fechaDeVencimiento = fechaDeVencimiento;
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
