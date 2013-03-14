package semper.carbon.modules

import semper.sil.{ast => sil}
import semper.carbon.boogie.{Type, Exp}

/**
 * A module for translating heap expressions (access, updating) and determining
 * the heap encoding.
 *
 * @author Stefan Heule
 */
trait HeapModule extends Module {

  /**
   * The type used for references.
   */
  def refType: Type
}