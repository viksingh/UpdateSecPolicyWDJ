// ---------------------------------------------------------------------------
// This file has been generated partially by the Web Dynpro Code Generator.
// MODIFY CODE ONLY IN SECTIONS ENCLOSED BY @@begin AND @@end,
// ALL OTHER CHANGES WILL BE LOST IF THE FILE IS REGENERATED.
// SECTIONS ENCLOSED BY $$begin AND $$end ARE MANAGED BY
// DEVELOPER STUDIO WIZARDS AND MUST NOT BE CHANGED EITHER.
// ---------------------------------------------------------------------------
package com.sap.demo.updsecpl.wd.comp.updsecpolicycomp;

// 
// IMPORTANT NOTE: 
// _ALL_ IMPORT STATEMENTS MUST BE PLACED IN THE FOLLOWING SECTION ENCLOSED
// BY @@begin imports AND @@end. FURTHERMORE, THIS SECTION MUST ALWAYS CONTAIN
// AT LEAST ONE IMPORT STATEMENT (E.G. THAT FOR IPrivateUpdSecPolicyCompView).
// OTHERWISE, USING THE ECLIPSE FUNCTION "Organize Imports" FOLLOWED BY
// A WEB DYNPRO CODE GENERATION (E.G. PROJECT BUILD) WILL RESULT IN THE LOSS
// OF IMPORT STATEMENTS.
//
//@@begin imports
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import com.sap.demo.updsecpl.wd.comp.updsecpolicycomp.wdp.IPrivateUpdSecPolicyCompView;
import com.sap.security.api.IUserAccount;
import com.sap.security.api.UMException;
import com.sap.security.api.UMFactory;
import com.sap.tc.webdynpro.progmodel.api.IWDMessageManager;

//@@end

//@@begin documentation
//@@end

public class UpdSecPolicyCompView implements java.io.Serializable 
{
  private static final long serialVersionUID = 0xe7bd5b7dbedabde7L;
  
  /**
   * Logging location.
   */
  @SuppressWarnings("unused")
  private static final com.sap.tc.logging.Location logger = 
    com.sap.tc.logging.Location.getLocation(UpdSecPolicyComp.class);
  
  static 
  {
    //@@begin id
    String id = "$Id$";
    //@@end
    com.sap.tc.logging.Location.getLocation("ID.com.sap.tc.webdynpro").infoT(id);
  }

  /**
   * Private access to the generated Web Dynpro counterpart 
   * for this controller class. <p>
   *
   * Use <code>wdThis</code> to gain typed access to the context,
   * to trigger navigation via outbound plugs, to get and enable/disable
   * actions, fire declared events, and access used controllers and/or 
   * component usages.
   *
   * @see com.sap.demo.updsecpl.wd.comp.updsecpolicycomp.wdp.IPrivateUpdSecPolicyCompView for more details
   */
  @SuppressWarnings("unused")
  private final IPrivateUpdSecPolicyCompView wdThis;

  /**
   * Root node of this controller's context. <p>
   *
   * Provides typed access not only to the elements of the root node 
   * but also to all nodes in the context (methods node<i>XYZ</i>()) 
   * and their currently selected element (methods current<i>XYZ</i>Element()). 
   * It also facilitates the creation of new elements for all nodes 
   * (methods create<i>XYZ</i>Element()). <p>
   *
   * @see com.sap.demo.updsecpl.wd.comp.updsecpolicycomp.wdp.IPrivateUpdSecPolicyCompView.IContextNode for more details.
   */
  @SuppressWarnings("unused")
  private final IPrivateUpdSecPolicyCompView.IContextNode wdContext;

  /**
   * A shortcut for <code>wdThis.wdGetAPI()</code>. <p>
   * 
   * Represents the generic API of the generic Web Dynpro counterpart 
   * for this controller. <p>
   */
  @SuppressWarnings("unused")
  private final com.sap.tc.webdynpro.progmodel.api.IWDViewController wdControllerAPI;
  
  /**
   * A shortcut for <code>wdThis.wdGetAPI().getComponent()</code>. <p>
   * 
   * Represents the generic API of the Web Dynpro component this controller 
   * belongs to. Can be used to access the message manager, the window manager,
   * to add/remove event handlers and so on. <p>
   */
  @SuppressWarnings("unused")
  private final com.sap.tc.webdynpro.progmodel.api.IWDComponent wdComponentAPI;
  
  /**
   * Creates a new instance of this controller.
   * <p>
   * This constructor is called by the Web Dynpro framework and must not
   * be used by the application coding.
   */
  public UpdSecPolicyCompView(IPrivateUpdSecPolicyCompView wdThis)
  {
    this.wdThis = wdThis;
    this.wdContext = wdThis.wdGetContext();
    this.wdControllerAPI = wdThis.wdGetAPI();
    this.wdComponentAPI = wdThis.wdGetAPI().getComponent();
  }

  //@@begin javadoc:wdDoInit()
  /** Hook method called to initialize controller. */
  //@@end
  public void wdDoInit()
  {
    //@@begin wdDoInit()
    //@@end
  }

  //@@begin javadoc:wdDoExit()
  /** Hook method called to clean up controller. */
  //@@end
  public void wdDoExit()
  {
    //@@begin wdDoExit()
    //@@end
  }

  //@@begin javadoc:wdDoModifyView
  /**
   * Hook method called to modify a view just before rendering. <p>
   *
   * This method conceptually belongs to the view itself, not to the
   * controller (cf. MVC pattern).
   * The Web Dynpro programming model recommends that UI elements can
   * only be accessed by code executed within the call to this hook method. <p>
   *
   * @param view The view's generic API, as provided by Web Dynpro.
   *        Provides access to UI elements.
   * @param firstTime Indicates whether the hook is called for the first time
   *        during the lifetime of the view.
   */
  //@@end
  public void wdDoModifyView(com.sap.tc.webdynpro.progmodel.api.IWDView view, boolean firstTime)
  {
    //@@begin wdDoModifyView
    //@@end
  }
  
  //@@begin javadoc:wdOnContextMenu
  /**
   * Handles context menu event.
   * 
   * @param contextMenuManager the context menu manager
   * @param event the context menu event
   */
  //@@end
  public final void wdOnContextMenu
  (
    final com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDContextMenuManager contextMenuManager,
    final com.sap.tc.webdynpro.progmodel.api.IWDContextMenuEvent event 
  )
  {
    //@@begin wdOnContextMenu
    //@@end
  }

  //@@begin javadoc:wdDoBeforeAction
  /**
   * Hook method called for additional validation of user input. <p>
   *
   * @param validation Interface for reporting validation errors
   */
  //@@end
  public void wdDoBeforeAction(com.sap.tc.webdynpro.progmodel.api.IWDBeforeAction validation)
  {
    //@@begin wdDoBeforeAction
    //@@end
  }

  //@@begin javadoc:onActionProcessUsers(ServerEvent)
  /**
   * Declared validating event handler. 
   * 
   * @param wdEvent generic event object provided by framework
   */
  //@@end
  public void onActionProcessUsers(com.sap.tc.webdynpro.progmodel.api.IWDCustomEvent wdEvent )
  {
    //@@begin onActionProcessUsers(ServerEvent)
	  
	  String filename = wdThis.wdGetUpdSecPolicyCompController().wdGetContext().currentContextElement().getFilePath();
	  
	  final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
	  Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	  IWDMessageManager msgMgr = wdComponentAPI.getMessageManager();
	  msgMgr.reportSuccess(" Filepath is " + filename);
	  
	  BufferedReader buffReader = null;
	  String dataLine = "";
	  
	  
		  try {
			buffReader = new BufferedReader(new FileReader(filename));
			
	        while (( dataLine = buffReader.readLine()) != null ) {

	        	String user = dataLine.trim();
	        	IUserAccount account = UMFactory.getUserAccountFactory().getUserAccountByLogonId(user);
	        	IUserAccount mutUserAcct = UMFactory.getUserAccountFactory().getMutableUserAccount(account.getUniqueID());

	        	String secPolcyUpdate = "technical";
	        	mutUserAcct.setSecurityPolicy(secPolcyUpdate); 
	        	mutUserAcct.save();
	        	mutUserAcct.commit();
	        	
	        	msgMgr.reportSuccess("User " + user + " security policy is set to " + mutUserAcct.getSecurityPolicy());	        	
	        	
	        }	  

	        
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			msgMgr.reportException(e.getMessage());
				} catch (IOException e) {
			msgMgr.reportException( e.getMessage());
			} catch (UMException e) {

				msgMgr.reportException( e.getMessage());
		}
	  
	  
    //@@end
  }

  /*
   * The following code section can be used for any Java code that is 
   * not to be visible to other controllers/views or that contains constructs
   * currently not supported directly by Web Dynpro (such as inner classes or
   * member variables etc.). <p>
   *
   * Note: The content of this section is in no way managed/controlled
   * by the Web Dynpro Designtime or the Web Dynpro Runtime. 
   */
  //@@begin others
  //@@end
}
