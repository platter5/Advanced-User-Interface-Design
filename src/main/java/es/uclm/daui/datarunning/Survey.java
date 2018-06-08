/********************************************************/
/*  Class: Survey.java                                  */
/*  Generated by UML2Android                            */
/*  Author: Francisco Martinez Esteso                   */
/********************************************************/

package es.uclm.daui.datarunning;


import java.util.ArrayList;

public class Survey implements PersistentDomainClass {

	public long _id = -1;

	public Integer Rating;
	public Integer OrganisationRating;
	public Integer RouteRating;
	public Integer GeneralRating;




	
 
	@Override
	public long getId(DbHelper db) {
		if (_id==-1) { // _id not set yet.
			_id = db.createSurvey(this);
		}
		return _id;
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long __id) {
		_id = __id;
	}

	public Integer getRating() {
		return Rating;
	}

	public void setRating(Integer _Rating) {
		Rating =_Rating;
	}

	public Integer getOrganisationRating() {
		return OrganisationRating;
	}

	public void setOrganisationRating(Integer _OrganisationRating) {
		OrganisationRating =_OrganisationRating;
	}

	public Integer getRouteRating() {
		return RouteRating;
	}

	public void setRouteRating(Integer _RouteRating) {
		RouteRating =_RouteRating;
	}

	public Integer getGeneraralRating() {
	return GeneralRating;
	}

	public void setGeneralRating(Integer _GeneralRating) {
		GeneralRating =_GeneralRating;
	}
}
