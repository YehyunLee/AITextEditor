package view;

import use_case.RunGameOutput;
import java.awt.event.ActionEvent;

/**
 * Interface for BattleView in the game.
 * Defines methods for updating game view and handling user interactions.
 */
public interface BattleViewInterface {

    /**
     * Displays the battle view on the screen.
     */
    void displayBattleView();

    /**
     * Prints a message to the game console.
     *
     * @param message The message to be displayed.
     */
    void printToConsole(String message);

    /**
     * Handles the event when the attack button is clicked.
     *
     * @param e The event generated by the click.
     */
    void attackButtonClicked(ActionEvent e);

    /**
     * Handles the event when the heavy attack button is clicked.
     *
     * @param e The event generated by the click.
     */
    void heavyAttackButtonClicked(ActionEvent e);

    /**
     * Handles the event when the swap button is clicked.
     *
     * @param e The event generated by the click.
     */
    void swapButtonClicked(ActionEvent e);

    /**
     * Handles the event when the light attack button is clicked.
     *
     * @param e The event generated by the click.
     */
    void lightAttackButtonClicked(ActionEvent e);

    /**
     * Handles the event when the true attack button is clicked.
     *
     * @param e The event generated by the click.
     */
    void trueAttackButtonClicked(ActionEvent e);

    /**
     * Handles the event when the zero button is clicked.
     *
     * @param e The event generated by the click.
     */
    void zeroButtonClicked(ActionEvent e);

    /**
     * Handles the event when the one button is clicked.
     *
     * @param e The event generated by the click.
     */
    void oneButtonClicked(ActionEvent e);

    /**
     * Handles the event when the two button is clicked.
     *
     * @param e The event generated by the click.
     */
    void twoButtonClicked(ActionEvent e);

    /**
     * Handles the event when the three button is clicked.
     *
     * @param e The event generated by the click.
     */
    void threeButtonClicked(ActionEvent e);

    /**
     * Handles the event when the four button is clicked.
     *
     * @param e The event generated by the click.
     */
    void fourButtonClicked(ActionEvent e);

    /**
     * Handles the event when the five button is clicked.
     *
     * @param e The event generated by the click.
     */
    void fiveButtonClicked(ActionEvent e);

    /**
     * Handles the event when the defense button is clicked.
     *
     * @param e The event generated by the click.
     */
    void defenseButtonClicked(ActionEvent e);

    /**
     * Handles the event when the heavy defense button is clicked.
     *
     * @param e The event generated by the click.
     */
    void heavyDefenseButtonClicked(ActionEvent e);

    /**
     * Handles the event when the light defense button is clicked.
     *
     * @param e The event generated by the click.
     */
    void lightDefenseButtonClicked(ActionEvent e);

    /**
     * Handles the event when the heal button is clicked.
     *
     * @param e The event generated by the click.
     */
    void healButtonClicked(ActionEvent e);

    /**
     * Handles the event when the light heal button is clicked.
     *
     * @param e The event generated by the click.
     */
    void lightHealButtonClicked(ActionEvent e);

    /**
     * Handles the event when the heavy heal button is clicked.
     *
     * @param e The event generated by the click.
     */
    void heavyHealButtonClicked(ActionEvent e);

    /**
     * Updates the health bar of the player's Pokémon.
     *
     * @param health The current health to set in the health bar.
     */
    void updatePlayerHealth(int health);

    /**
     * Updates the health bar of the enemy Pokémon.
     *
     * @param health The current health to set in the health bar.
     */
    void updateEnemyHealth(int health);

    /**
     * Updates the front GIF image of the Pokémon.
     *
     * @param frontGifPath The path to the new front GIF image.
     */
    void updateFrontGif(String frontGifPath);

    /**
     * Updates the back GIF image of the Pokémon.
     *
     * @param backGifPath The path to the new back GIF image.
     */
    void updateBackGif(String backGifPath);

    /**
     * Sets the game output object for the view.
     *
     * @param gameOutput The game output object to be set.
     */
    void setGameOutput(RunGameOutput gameOutput);
}
