case class BanditState(
  actionRewards: Vector[Double], // cumulitive reward for each arm (action)
  actions: Map[Int, Int]         // Map from index of action to count of times action was played
)

def banditStep(
  epsilon: Double,
  takeAction: Int => Boolean, // Function that simulates the result of taking an action. 1 or 0
  selectAction: (Map[Int, Int], Vector[Double]) => Int
)(state: BanditState): BanditState = {
    val action = selectAction(state.actions, state.actionRewards)
    val reward = takeAction(nextAction)
    val newCount = s.actions.get(nextAction) + 1
    val newReward = s.actions.get(nextAction) * actionRewards(action) + reward / actionCount
    BanditState(s.actionRewards.updated(action, newReward), s.actions.updated(action, newCount))
}
