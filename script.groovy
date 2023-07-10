def buildAPP(){
    echo 'building the Application'
}

def testAPP(){
    echo 'testing the Application'
}

def deployAPP(){
    echo 'Deploying the Application'
     echo "Deploying  version ${params.VERSION}"
}

return this