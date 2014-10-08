class UrlMappings {

	static mappings = {
      "/$controller/$action?/$id?(.$format)?"{
          constraints {
          }
      }

      "/sepomexes"(resources:"sepomex")

      "/"(view:"/index")
    	"500"(view:'/error')
	}
}
