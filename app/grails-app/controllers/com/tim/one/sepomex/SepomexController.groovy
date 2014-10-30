package com.tim.one.sepomex

class SepomexController {

	static allowedMethods = [show:'GET']

    def show(String id){
    render(contentType:"application/json", status:200) {
      Sepomex.findByDCodigo(id)
    }
  }
  
}
