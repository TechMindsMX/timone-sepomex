package com.tim.one.sepomex

class SepomexController {

		static allowedMethods = [index:'GET']

    def index() { 
    	render(contentType:"application/json", status:200) {
      [sepomexes: Sepomex.findAllByDCodigo(params.cp)]
    	}
    }

    def show(String cp){
    render(contentType:"application/json", status:200) {
      Sepomex.findByDCodigo(cp)
    }
  }
  
}
