package javacodechecker;
public class DirectObjectReference{
 final static int INT_ARRAY[] = {1,2,3,4,5};
@RequestMapping(value = "/records/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
@Timed
public ResponseEntity < Record > get(@PathVariable Long id) {
return log.debug("REST request to get record" + id);
 
}

}
