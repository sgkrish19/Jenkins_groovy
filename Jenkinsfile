def gv

pipeline {
      agent any
      parameters{
        choice(name : 'VERSION',choices:['1.1.0','1.2.0','1.3.0'],description:'')
        booleanparam(name:'executeTests',defaultValues:true,description:'')
      }
      
            stages{
                stage("init"){
                    steps{
                        gv =load "script.groovy"
                    }
                }
                stage("build"){
                        steps{
                          script{
                            gv.buildAPP()
                          }    
                }
            }
                stage("test"){
                        when{
                            expression{
                                params.executeTests
                            }
                        }
                        steps{
                          script{
                            gv.testAPPAPP()
                          }  
                }
            }
                stage("deploy"){
                        steps{
                                script{
                            gv.deployAPP()
                          }               
                }
            }
      }
}
