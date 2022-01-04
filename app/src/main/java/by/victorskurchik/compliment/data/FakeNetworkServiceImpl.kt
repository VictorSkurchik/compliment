package by.victorskurchik.compliment.data

import by.victorskurchik.compliment.domain.models.Compliment
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FakeNetworkServiceImpl @Inject constructor() : NetworkService {

    var compliments: List<Compliment> = messages.map { Compliment(it) }

    override suspend fun getCompliment(): Compliment {
        return compliments.random()
    }

    companion object {

        private val messages = listOf(
            "Hey there sexy!",
            "I hope your day is as nice as you!",
            "I'm lucky to be your mirror!",
            "On a scale from 1 to 10, you're an 15!",
            "Being awesome is hard, but you'll manage",
            "I see a lot of myself in you",
            "Damn. You're looking good!",
            "Yes, you are the fairest of them all",
            "At least two friends are going to name their child after you",
            "You are freakishly good at thumb wars",
            "The FBI tapped your phone just to hear the sound of your voice",
            "You never forget to fill the ice-cube tray",
            "You could make up a weird religion or diet and everyone would follow it",
            "Your handshake conveys intelligence, confidence, and minor clamminess",
            "Cops admire your ability to stay a perfect 3-5 miles above the speed limit",
            "Cockroaches, mice, and other pests avoid your place out of respect",
            "Everyone at the laundromat thinks you have the cutest underwear",
            "People behind you at movies think you are the perfect height",
            "Your parents argue over which one of them you look like",
            "Your smile is contagious",
            "You look great today",
            "You're a smart cookie",
            "I bet you make babies smile",
            "You have impeccable manners",
            "I like your style",
            "You have the best laugh",
            "I appreciate you",
            "You are the most perfect you there is",
            "You're an awesome friend",
            "You light up the room",
            "You deserve a hug right now",
            "You should be proud of yourself",
            "You're more helpful than you realize",
            "You have a great sense of humor",
            "You've got all the right moves!",
            "You're even more beautiful on the inside than you are on the outside",
            "If cartoon bluebirds were real, a bunch of them would be sitting on your shoulders singing right now",
            "You're like sunshine on a rainy day",
            "Your ability to recall random factoids at just the right time is impressive",
            "You're a great listener",
            "How is it that you always look great, even in sweatpants?",
            "Everything would be better if more people were like you!",
            "You were cool way before hipsters were cool",
            "That color is perfect on you",
            "Hanging out with you is always a blast",
            "You smell really good",
            "Being around you makes everything better!",
            "Colors seem brighter when you're around",
            "You're wonderful",
            "You have cute elbows. For reals!",
            "Jokes are funnier when you tell them",
            "You're better than a triple-scoop ice cream cone. With sprinkles",
            "Your belly button is kind of adorable",
            "Your hair looks stunning",
            "You're one of a kind!",
            "You're inspiring",
            "You should be thanked more often. So thank you!!",
            "You have the best ideas",
            "Everyone gets knocked down sometimes, but you always get back up and keep going",
            "You're a candle in the darkness",
            "You're a great example to others",
            "Being around you is like being on a happy little vacation",
            "You always know just what to say",
            "You're always learning new things and trying to better yourself, which is awesome",
            "If someone based an Internet meme on you, it would have impeccable grammar",
            "When you make a mistake, you fix it",
            "Who raised you? They deserve a medal for a job well done",
            "You're great at figuring stuff out",
            "Your voice is magnificent",
            "The people you love are lucky to have you in their lives",
            "You're like a breath of fresh air"
        )
    }
}