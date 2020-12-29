node {

	stage('Build'){

		if(env.TAG_NAME != null){
 		   println("we are building a tag is ${env.TAG_NAME}")
                  }

 		else {
                       println("We are building a branch")
                    }

                if(env.TAG_NAME == "release-1.0"){
			println("We are building a specifically release tag-1.0")
                   }
         }
}

