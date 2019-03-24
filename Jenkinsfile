// Powered by Infostretch 

timestamps {

node () {

	stage ('编译') {
 			// Maven build step
	withMaven(maven: '(Default)') { 
 			if(isUnix()) {
 				sh "mvn compile " 
			} else { 
 				bat "mvn compile " 
			} 
 		} 
	}
}
}
