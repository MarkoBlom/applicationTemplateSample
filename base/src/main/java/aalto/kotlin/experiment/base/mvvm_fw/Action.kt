package aalto.kotlin.experiment.base.mvvm_fw

/**
 * Created by marko on 8/24/2017.
 *
 * Presents an Action upon a View to process e.g. show progress animation/bar, start activity etc. anything you specify in action
 * Action always has a Type and optionally Data
 */
class Action protected constructor(
    // Action type Enumeration, e.g. show Progress animation, Hide Progress animation, etc.
    val type: Type,
    // Data associated with Action
    // This is optional, can be null: Put here any extra data that needs to be passed to View
    val data: Map<String, Any>?
) {
    enum class Type {
        PROGRESS_ANIM_SHOW,
        PROGRESS_ANIM_DISMISS,
        NEXT_SCREEN,
        SHOW_SNACK_BAR,
        GO_TO_TRANSACTIONS_SCREEN,
        GO_TO_REWARDS,
        GO_TO_PAYMENT_FIELDS_ENTRY,
        GO_TO_PAYMENT_SUMMARY,
        SHOW_OK_DIALOG,
        GO_HOME,
        SHOW_ERROR_DIALOG,
        SHOW_WARNING_DIALOG,
        ERROR_CONNECTION_TIMEOUT,
        ERROR_REENTER_CARD
    }

    companion object {

        fun create(type: Type): Action {
            return Action(type, null)
        }

        fun create(type: Type,
                   data: Map<String, Any>?) : Action {
            return Action(type, data)
        }
    }

}