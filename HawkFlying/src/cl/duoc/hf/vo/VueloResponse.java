package cl.duoc.hf.vo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class VueloResponse {

	public VueloResponse() {}
	
		@JsonProperty("items")
		private ArrayList<VueloVO> vuelos = new ArrayList<VueloVO>();
		@JsonIgnore
		private Map<String, Object> additionalProperties = new HashMap<String, Object>();

		/**
		 * 
		 * @return The items
		 */
		@JsonProperty("items")
		public ArrayList<VueloVO> getVuelos() {
			return vuelos;
		}

		/**
		 * 
		 * @param items
		 *            The items
		 */
		@JsonProperty("items")
		public void setVuelos(ArrayList<VueloVO> vuelos) {
			this.vuelos = vuelos;
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


