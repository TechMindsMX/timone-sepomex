package com.tim.one.sepomex

class Sepomex {
  Integer id
	String dCodigo
	String dAsenta
	String dTipoAsenta
	String dMnpio
	String dEstado
	String dCiudad
	String dCP
	String cEstado
	String cOficina
	String cCP
	String cTipoAsenta
	String cMnipio
	String idAsentaCpcnos
	String dZona
	String cCveCiudad	

  static mapping = {
  	version false
    table 'sepomex'
    id column:'id'
  	dCodigo column:'d_codigo'
  	dAsenta column:'d_asenta'
  	dTipoAsenta column:'d_tipo_asenta'
  	dMnpio column:'d_mnpio'
  	dEstado column:'d_estado'
  	dCiudad column:'d_ciudad'
  	dCP column:'d_CP'
  	cEstado column:'c_estado'
  	cOficina column:'c_oficina'
  	cCP column:'c_CP'
  	cTipoAsenta column:'c_tipo_asenta'
  	cMnipio column:'c_mnpio'
  	idAsentaCpcnos column:'id_asenta_cpcons'
  	dZona column:'d_zona'
  	cCveCiudad column:'c_cve_ciudad'
  }

}
